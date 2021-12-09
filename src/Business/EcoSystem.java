/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Actions.PoliceDepartment.Police.PolicemanDirectory;
import Actions.Shelter.Admin.ShelterDirectory;
import Actions.VolunteerOrg.Volunteer.VolunteerDirectory;
import Adoption.Orphanage.OrphanageDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Clinic.Admin.ClinicDirectory;
import Clinic.DNAtesting.DnaTestingDirectory;
import Clinic.Treating.TreatDorDirectory;
import Donation.DonationDirectory;
import Reporting.CommonReporting.ChildrenDirectory;
import Reporting.CommonReporting.ReportedChildDirectory;
import Reporting.Parent.ParentDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ChildrenDirectory childrenDirectory;
    private PolicemanDirectory policemanDirectory;
    private TreatDorDirectory treatDorDirectory;
    private ClinicDirectory clinicDirectory;
    private ShelterDirectory shelterDirectory;
    private ParentDirectory parentDirectory;
    private ReportedChildDirectory reportedChildDirectory;
    private DnaTestingDirectory dnaTestingDirectory;
    private VolunteerDirectory volunteerDirectory;
    private DonationDirectory donationDirectory;
    private OrphanageDirectory orphanageDirectory;

    public EcoSystem(PolicemanDirectory policemanDirectory) {
        this.policemanDirectory = policemanDirectory;
        
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();

	childrenDirectory = new ChildrenDirectory();
        policemanDirectory = new PolicemanDirectory();
        treatDorDirectory = new TreatDorDirectory();
        clinicDirectory = new ClinicDirectory();
        shelterDirectory = new ShelterDirectory();
        parentDirectory = new ParentDirectory();
        reportedChildDirectory = new ReportedChildDirectory();
        dnaTestingDirectory = new DnaTestingDirectory();
        volunteerDirectory = new VolunteerDirectory();
        donationDirectory = new DonationDirectory();
        orphanageDirectory = new OrphanageDirectory();
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
	
    public ChildrenDirectory getChildrenDirectory() {
        return childrenDirectory;
    }

    public void setChildrenDirectory(ChildrenDirectory childrenDirectory) {
        this.childrenDirectory = childrenDirectory;
    }
    
    public PolicemanDirectory getPolicemanDirectory() {
        return policemanDirectory;
    }

    public void setPolicemanDirectory(PolicemanDirectory policemanDirectory) {
        this.policemanDirectory = policemanDirectory;
    }

    public TreatDorDirectory getTreatDorDirectory() {
        return treatDorDirectory;
    }

    public void setTreatDorDirectory(TreatDorDirectory treatDorDirectory) {
        this.treatDorDirectory = treatDorDirectory;

    }

    public ClinicDirectory getClinicDirectory() {
        return clinicDirectory;
    }

    public void setClinicDirectory(ClinicDirectory clinicDirectory) {
        this.clinicDirectory = clinicDirectory;
    }

    public OrphanageDirectory getOrphanageDirectory() {
        return orphanageDirectory;
    }

    public void setOrphanageDirectory(OrphanageDirectory orphanageDirectory) {
        this.orphanageDirectory = orphanageDirectory;
    }

    public ShelterDirectory getShelterDirectory() {
        return shelterDirectory;
    }

    public void setShelterDirectory(ShelterDirectory shelterDirectory) {
        this.shelterDirectory = shelterDirectory;
    }

    public ParentDirectory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(ParentDirectory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public ReportedChildDirectory getReportedChildDirectory() {
        return reportedChildDirectory;
    }

    public void setReportedChildDirectory(ReportedChildDirectory reportedChildDirectory) {
        this.reportedChildDirectory = reportedChildDirectory;
    }

    public DnaTestingDirectory getDnaTestingDirectory() {
        return dnaTestingDirectory;
    }

    public void setDnaTestingDirectory(DnaTestingDirectory dnaTestingDirectory) {
        this.dnaTestingDirectory = dnaTestingDirectory;
    }

    public DonationDirectory getDonationDirectory() {
        return donationDirectory;
    }

    public void setDonationDirectory(DonationDirectory donationDirectory) {
        this.donationDirectory = donationDirectory;
    }
	
    
    
    
}
