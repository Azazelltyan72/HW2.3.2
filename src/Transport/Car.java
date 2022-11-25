package Transport;

public class Car {
    private final String brand;
    private final String model;
    private final String productionYear;
    private final String productionCountry;
    private final int numberOfSeats;
    private final String bodyType;
    private String color;
    private String engineVolume;
    private String transmission;

    private String registrationNumber;

    private String typeOfRubber;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getBodyType() {
        return bodyType;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTypeOfRubber(boolean summerTires) {
        return typeOfRubber;
    }

    public void setTypeOfRubber(boolean summerTires) {
        if (summerTires == true) {
            this.typeOfRubber = "Летняя резина";
        } else {
            this.typeOfRubber = "Зимняя резина";
        }
    }

    public Car(String brand,
               String model,
               String productionYear,
               String productionCountry,
               int numberOfSeats,
               String bodyType,
               String color,
               String engineVolume,
               String transmission,
               String registrationNumber,
               boolean summerTires) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (productionYear != null && !productionYear.isEmpty() && !productionYear.isBlank()) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = "2000";
        }
        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "Россия";
        }
        if (numberOfSeats >= 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = Math.abs(numberOfSeats);
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "Пикап";
        }
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (engineVolume != null && !engineVolume.isEmpty() && !engineVolume.isBlank()) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = "1,5 л";
        }
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Полуавтомат";
        }

        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "х000хх000";
        }
        if (summerTires == true) {
            this.typeOfRubber = "Летняя резина";
        } else {
            this.typeOfRubber = "Зимняя резина";
        }

    }

    public void changeTiresForSeasonalOnes() {
        if (typeOfRubber == "Зимняя резина") {
            typeOfRubber = "Летняя резина";
        } else {
            typeOfRubber = "Зимняя резина";
        }
    }

    public boolean checkRegistrationNumber() {
        //х000хх000
        if (this.registrationNumber.length() != 9) {
            System.out.println("Регистрационный номер неверный.");

            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", bodyType='" + bodyType + '\'' +
                ", color='" + color + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", transmission='" + transmission + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", typeOfRubber='" + typeOfRubber + '\'' +
                '}';
    }
}
