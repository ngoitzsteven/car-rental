export class Car{
    carId:number;
    model:string;
    brand:string;
    mileage:number;
    color:string;
    clazz:string;
    reservationStatus:string;
    reservation: any[];
    seats: number;

    constructor(carId = 0, model = '', brand ='', mileage = 0, color = '', clazz = '', reservationStatus = '', reservation = [], seats = 0){
        this.carId =carId;
        this.model =model;
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.clazz = clazz;
        this.reservationStatus = reservationStatus;
        this.reservation = reservation;
        this.seats=seats;
    }
}