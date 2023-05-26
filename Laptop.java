/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и 
методы. Реализовать в Java. */

package Homework6;

public class Laptop {
    private String model;
    private String brand;
    private Float displaySize;
    private String cpuModel;
    private Integer coreNumber;
    private String gpuModel;
    private String ramType;
    private Integer ramSize;
    private String os;
    private String hddType;
    private Integer hddSize;
    private Float batterySize;
    public Laptop(String model, String brand, Float displaySize, String cpuModel, Integer coreNumber, String gpuModel,
            String ramType, Integer ramSize, String os, String hddType, Integer hddSize, Float batterySize) {
        this.model = model;
        this.brand = brand;
        this.displaySize = displaySize;
        this.cpuModel = cpuModel;
        this.coreNumber = coreNumber;
        this.gpuModel = gpuModel;
        this.ramType = ramType;
        this.ramSize = ramSize;
        this.os = os;
        this.hddType = hddType;
        this.hddSize = hddSize;
        this.batterySize = batterySize;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Float getDisplaySize() {
        return displaySize;
    }
    public void setDisplaySize(Float displaySize) {
        this.displaySize = displaySize;
    }
    public String getCpuModel() {
        return cpuModel;
    }
    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }
    public Integer getCoreNumber() {
        return coreNumber;
    }
    public void setCoreNumber(Integer coreNumber) {
        this.coreNumber = coreNumber;
    }
    public String getGpuModel() {
        return gpuModel;
    }
    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }
    public String getRamType() {
        return ramType;
    }
    public void setRamType(String ramType) {
        this.ramType = ramType;
    }
    public Integer getRamSize() {
        return ramSize;
    }
    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getHddType() {
        return hddType;
    }
    public void setHddType(String hddType) {
        this.hddType = hddType;
    }
    public Integer getHddSize() {
        return hddSize;
    }
    public void setHddSize(Integer hddSize) {
        this.hddSize = hddSize;
    }
    public Float getBatterySize() {
        return batterySize;
    }
    public void setBatterySize(Float batterySize) {
        this.batterySize = batterySize;
    }
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", brand=" + brand + ", displaySize=" + displaySize + ", cpuModel=" + cpuModel
                + ", coreNumber=" + coreNumber + ", gpuModel=" + gpuModel + ", ramType=" + ramType + ", ramSize="
                + ramSize + ", os=" + os + ", hddType=" + hddType + ", hddSize=" + hddSize + ", batterySize="
                + batterySize + "]";
    }
    
    

}