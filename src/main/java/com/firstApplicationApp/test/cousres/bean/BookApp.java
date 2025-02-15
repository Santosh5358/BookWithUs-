package com.firstApplicationApp.test.cousres.bean;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.List;

@Entity
//@SQLDelete(sql = "UPDATE book_app SET deleted = true WHERE id=?")
//@Where(clause = "deleted=false")
public class BookApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String email;
    private int numberOfPassengers;
    private  String selectedMovie;
    private String imgsrc;
    private  int amount;
    private boolean deleted;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }



    public void setAmount(int amount) {
        this.amount = amount;
    }



    public boolean isDeleted() {
        return deleted;
    }


    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private List<Passenger> passengers ;


    public BookApp(int id, int numberOfPassengers, String selectedMovie, String imgsrc, int amount,String email) {
        super();
        this.bookId = id;
        this.numberOfPassengers = numberOfPassengers;
        this.selectedMovie = selectedMovie;
        this.imgsrc = imgsrc;
        this.amount = amount;
        this.email=email;

    }

    public BookApp() {
    }


    public int getId() {
        return bookId;
    }


    public String getImgsrc() {
        return imgsrc;
    }

    public void setId(Integer id) {
        this.bookId = id;
    }

    public int getAmount() {
        return amount;
    }

    public  List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getSelectedMovie() {
        return selectedMovie;
    }



    @Override
    public String toString() {
        return "BookApp{" +
                "id=" + bookId +
                ", nubmberOfTicket=" + numberOfPassengers +
                ", movieName='" + selectedMovie + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", amount=" + amount +
                '}';
    }


}
