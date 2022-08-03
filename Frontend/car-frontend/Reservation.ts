export class Reservation{
    reservationId : number;
    startDate: Date;
    endDate: Date;
    status: string;
    carId: number;
    customerId: number;


    constructor(reservationId = 0, startDate = new Date(), endDate = new Date(), status ='', carId = 0, customerId = 0){
        this.reservationId = reservationId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.carId = carId;
        this.customerId=customerId;

    }

}


