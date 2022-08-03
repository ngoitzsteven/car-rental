export class Car{
    carId:number;
    model:string;
    brand:string;
    mileage:number;
    color:string;
    class:string;
    reservationStatus:string;


    constructor(carId = 0, model = '', brand ='', mileage = 0, color = '', clazz = '', reservationStatus = ''){
        this.carId =carId;
        this.model =model;
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.class = clazz;
        this.reservationStatus = reservationStatus;

    }
}