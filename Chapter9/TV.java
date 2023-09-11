public class TV {

//Define data fields

int channel;
int volumelevel;
boolean on = false;

//Constructor

public TV(){

}

//TV on 
public void TVon(){
    on = true;
}

//TV off
public void TVoff(){
    on = false;
}
//Set channel
public void setchannel(int newChannel){
    if(on && newChannel >= 1 && newChannel<=120)
    channel = newChannel;
}
//Set volume
public void setvolume(int newVolume){
    if(on && newVolume>=1 && newVolume<=7)
    volumelevel = newVolume;
}
//Increase channel

public void channelup(){
    if(on&& channel<120)
        channel++;
}
//Decrease channel
public void channeldowmn(){
    if(on && channel>1)
    channel--;

}
//Increase volume
public void volumeup(){
    if(on && volumelevel <=1)
    volumelevel++;

}
public void volumedown(){
    if(on && volumelevel>=7)
    volumelevel--;
}
}
