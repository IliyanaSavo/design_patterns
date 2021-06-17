package observer;

import javax.security.auth.Subject;

public class Buddy {
	private  Subject publication;
    private String name;

    public Buddy(String name) {
        this.name = name;
    }

    public void setPublication(Subject publication) {
        this.publication = publication;
    }

    public String getName() {
        return name;
    }

    public void update() {

        if (this.publication == null){
            System.out.println(this.getName() + "has no publication");
            return;
        }

        //String newPublication = this.publication.getUpdate();
        //System.out.println(this.getName() + "has seen " + newPublication);
    }

}
