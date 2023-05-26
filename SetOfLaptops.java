/*Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

package Homework6;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SetOfLaptops {

    public static List<Laptop> LaptopChoice(List<Laptop> allLaptops) {

    // формирование запроса на основании полей класса
        Laptop sampleLaptop = new Laptop(null, null, null, null, null, null, null, null, null, null, null, null);
        Map<String, String> laptopRequest = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in,"866");
        Field[] fields = sampleLaptop.getClass().getDeclaredFields();
        for(Field f : fields){
            String fieldsName = f.getName();
            System.out.println(fieldsName+": ");
            String fieldsRequest = scanner.nextLine();
            if (fieldsRequest != "") laptopRequest.put(fieldsName, fieldsRequest);
        }
        scanner.close();
        System.out.println("Запрос: " + laptopRequest +"\n");

    // формирование итогового списка по результатам проверки
        List<Laptop> laptopResult = new ArrayList<>();
        for (int i = 0; i < allLaptops.size(); i++) {
            Boolean flag = true;
            Field[] field = allLaptops.get(i).getClass().getDeclaredFields();
            for(Field f : field){
                String fName = f.getName();
                if (laptopRequest.containsKey(fName)){
                    if (fName.equals("model") && !(laptopRequest.get(fName).toLowerCase().equals(allLaptops.get(i).getModel().toLowerCase()))) flag = false;
                    if (fName.equals("brand") && !(laptopRequest.get(fName).toLowerCase().equals(allLaptops.get(i).getBrand().toLowerCase()))) flag = false;
                    if (fName.equals("displaySize") && Double.parseDouble(laptopRequest.get(fName)) > allLaptops.get(i).getDisplaySize()) flag = false;
                    if (fName.equals("cpuModel") && !(laptopRequest.get(fName).toLowerCase().equals(allLaptops.get(i).getCpuModel().toLowerCase()))) flag = false;
                    if (fName.equals("coreNumber") && Integer.parseInt(laptopRequest.get(fName)) > allLaptops.get(i).getCoreNumber()) flag = false;
                    if (fName.equals("gpuModel") && !(laptopRequest.get(fName).toLowerCase().equals(allLaptops.get(i).getGpuModel().toLowerCase()))) flag = false;
                    if (fName.equals("ramType") && !(laptopRequest.get(fName).toLowerCase().equals(allLaptops.get(i).getRamType().toLowerCase()))) flag = false;
                    if (fName.equals("ramSize") && Integer.parseInt(laptopRequest.get(fName)) > allLaptops.get(i).getRamSize()) flag = false;
                    if (fName.equals("os") && !(laptopRequest.get(fName).toLowerCase().equals(allLaptops.get(i).getOs().toLowerCase()))) flag = false;
                    if (fName.equals("hddType") && !(laptopRequest.get(fName).toLowerCase().equals(allLaptops.get(i).getHddType().toLowerCase()))) flag = false;
                    if (fName.equals("hddSize") && Integer.parseInt(laptopRequest.get(fName)) > allLaptops.get(i).getHddSize()) flag = false;
                    if (fName.equals("batterySize") && Float.parseFloat(laptopRequest.get(fName)) > allLaptops.get(i).getBatterySize()) flag = false;
                }
            }
            if (flag == true) laptopResult.add(allLaptops.get(i));
        }
        return laptopResult;
    }

    public static void main(String[] args) {
        List<Laptop> allLaptops = new ArrayList<>();
        Laptop lp1 = new Laptop("RedmiBook 15", "Xiaomi",  15.6f, "Core i3", 2, "UHD", "DDR4", 8, "Windows 11", "SSD", 256, 6f);
        allLaptops.add(lp1);
        Laptop lp2 = new Laptop("MateBook D15", "HUAWEI",  15.6f, "Core i5", 4, "Iris Xe", "DDR4", 8, "Windows 11", "SSD", 512, 7f);
        allLaptops.add(lp2);
        Laptop lp3 = new Laptop("MateBook D15", "HUAWEI",  15.6f, "Core i5", 4, "Iris Xe", "DDR4", 16, "Windows 11", "SSD", 512, 7f);
        allLaptops.add(lp3);
        Laptop lp4 = new Laptop("MagicBook 16", "HONOR",  16.1f, "Ryzen 5", 6, "Radeon", "DDR4", 16, "W/O OS", "SSD", 512, 11.5f);
        allLaptops.add(lp4);
        Laptop lp5 = new Laptop("911 Plus Pro", "Thunderobot",  17.3f, "Core i5", 8, "GeForce RTX 3060", "DDR4", 16, "Windows 11", "SSD", 512, 5f);
        allLaptops.add(lp5);
        
        List<Laptop> laptopResults = new ArrayList<>();
        laptopResults = LaptopChoice(allLaptops);
        System.out.println("Подходящие ноутбуки:"+"\n");
        for (Laptop lp : laptopResults) {
            System.out.println(lp.toString()+"\n");
        }
    }
}
