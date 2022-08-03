export class Customer{
    customerId:number;
    customerName:String;
    location: String;

    constructor(customerId = 0, customerName = '', location = '' ){
        this.customerId = customerId;
        this.customerName = customerName;
        this.location = location;
    }
}