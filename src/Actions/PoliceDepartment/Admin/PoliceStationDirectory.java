/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actions.PoliceDepartment.Admin;
import Business.UserAccount.UserAccount;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class PoliceStationDirectory {
    private ArrayList<PoliceStation> policeStationDirectory;

    public PoliceStationDirectory(ArrayList<PoliceStation> policeStationDirectory) {
        this.policeStationDirectory = new ArrayList<>();
    }

    public ArrayList<PoliceStation> getPoliceStationDirectory() {
        return policeStationDirectory;
    }

    public void setPoliceStationDirectory(ArrayList<PoliceStation> policeStationDirectory) {
        this.policeStationDirectory = policeStationDirectory;
    }
    
    public PoliceStation createStation(){
        PoliceStation station = new PoliceStation();
        policeStationDirectory.add(station);
        return station;
    }
    
    public PoliceStation createStation(UserAccount ua, String stationName, int zipcode, String address, int id, long phoneNum){
        PoliceStation station = new PoliceStation();
        station.setUa(ua);
        station.setStationName(stationName);
        station.setZipcode(zipcode);
        station.setAddress(address);
        station.setId(id);
        station.setPhoneNum(phoneNum);
        policeStationDirectory.add(station);
        return station;
    }
    
    public void deleteStation(PoliceStation ps){
        policeStationDirectory.remove(ps);
    }
    
    public PoliceStation getStation(int id){
        for(PoliceStation ps: policeStationDirectory){
            if(ps.getId() == id){
                return ps;
            }
        }
        return null;
    }
}
