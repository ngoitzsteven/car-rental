export class Reservation{
    reservationId : number;
    startDate: string;
    endDate: string;
    status: string;
    carId: number;
    customerId: number;


    constructor(reservationId = 0, startDate = '', endDate = '', status ='Booked', carId = 10, customerId = 1){
        this.reservationId = reservationId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.carId = carId;
        this.customerId=customerId;

    }

}


