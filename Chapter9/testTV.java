public class testTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.TVon();
        tv1.setchannel(22);
        tv1.setvolume(5);
        System.out.println("TV1's channel is "+tv1.channel+ " and volume is "+tv1.volumelevel);
        TV tv2 = new TV();
        tv2.TVon();
        tv2.channelup();
        tv2.channelup();
        tv2.volumeup();
        tv2.volumeup();
        System.out.println("TV2's channel is "+tv2.channel+ " and volume is "+tv2.volumelevel);

        TV tv3 = new TV();
        tv3.TVon();
        tv3.channelup();
        tv3.volumeup();
        System.out.println("TV3's channel is "+tv3.channel+ " and volume is "+tv3.volumelevel);



    } 
    
}
