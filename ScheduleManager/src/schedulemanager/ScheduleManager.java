/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schedulemanager;

import employeeform.FEmpInit;
import turnsform.FTurnsInit;
import missform.FMissInit;
import holidayform.FHolidayInit;

/**
 *
 * @author ART
 */
public class ScheduleManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FEmpInit fei = new FEmpInit();
        //fei.setVisible(true);
        //FTurnsInit fti = new FTurnsInit("Ricardo Nunes", "1234");
        //fti.setVisible(true);
        //FMissInit fme = new FMissInit("Ricardo Nunes", "1234");
        //fme.setVisible(true);
        FHolidayInit fhe = new FHolidayInit("Ricardo Nunes", "1234");
        fhe.setVisible(true);
    }
    
}
