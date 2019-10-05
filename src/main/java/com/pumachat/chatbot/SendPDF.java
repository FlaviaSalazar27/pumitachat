package com.pumachat.chatbot;

public class SendPDF {
    public String SendRoute(String routename){
        String R="";
        if (routename == "Achumani" ||routename == "San Pedro"){
            R= "Aqui deberia aparecer la ruta Achumani - San Pedro en PDF";
        }
        if (routename == "PUC" ||routename == "Chasquipampa"){
            R= "Aqui deberia aparecer la ruta Chasquipampa - PUC en PDF";
        }
    return R;}
}