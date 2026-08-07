class Com {
// class
    public void playMusic() {
        System.out.println("playing music");
    }

    public String getMeApen(int cost) {
        if (cost > 10) {
            return "pen";
        } else {
            return "pencil";
        }
    }

    public static void main(String[] args) {

        Com c  = new Com(); // object creation
        //c =refernce variable

        c.playMusic();

        String item = c.getMeApen(5);

        System.out.println(item);
    }
}