public class UrlArr {
    public static void main(String[] args){
        String url = "https://www.youtube.com/watch?v=Z8zAKYLZBqc";
        String[] splitUrl = url.split("v=");

        String idVideo = splitUrl[1];
        String imgUrl = "https://i3.ytimg.com/vi/" + idVideo + "/maxresdefault.jpg";
        System.out.println(imgUrl);
    }
}
