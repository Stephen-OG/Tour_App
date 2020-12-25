/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourapp.Classes;

/**
 *
 * @author user
 */
public class Tourist {
    //declaration of Tourist properties
    private String name;
    private String country;
    AudioLanguage audioLanguage;
    
    //parameterized constructor with three parameters tourist name and tourist country
    public Tourist(String name, String country, AudioLanguage language){
        this.name = name;
        this.country = country;
        this.audioLanguage = language;
    }
    
    // decleration of Tourist Methods
    
    //declaring a getter for tourist name
    public String getName(){
    return name;
    }
    //declaring a getter for tourist country
    public String getCountry(){
    return country;
    }
    
    //declaring a getter for tourist audiolanguage
    public AudioLanguage getAudioLanguage(){
    return audioLanguage;
    }
    
    //declaring a setter for tourist audiolanguage
    public void setAudioLanguage(AudioLanguage newAudioLanguage){
     audioLanguage = newAudioLanguage;
    }
    
    // a well formatted String that contains all the properties of Tourist object 
    @Override
    public String toString(){   
    return "Tourist "+name+", from "+country+
            ", added to the TourApp. Tourist "+name+" speaks "+audioLanguage;
    }
    
}
