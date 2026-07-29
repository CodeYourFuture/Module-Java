package rental.model;

import java.time.LocalDate;

public class Rental {

    private final LocalDate dueDate;
    private final double capitalAmount;
    private final double interestAmount;
    private   boolean paid;



    public Rental(LocalDate dueDate , double capitalAmount , double interestAmount){


        this.dueDate = dueDate;
        this.capitalAmount = capitalAmount;
        this.interestAmount = interestAmount;

    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    public double getCapitalAmount (){
        return capitalAmount;
    }

    public double getInterestAmount (){
        return  interestAmount;
    }


    public boolean isPaid() {
        return paid;
    }


    public void markAsPaid(){

        this.paid =true;

     }

    @Override
    public String toString() {

        return "Rental{" +
                "dueDate=" + dueDate +
                ", capitalAmount=" + capitalAmount +
                ", interestAmount=" + interestAmount +
                ", paid=" + paid +
                '}';
    }
}
