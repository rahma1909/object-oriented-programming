
package car;


public abstract class car1 {
    int numberofwheels;
    float height;
    float weight;

    public int getNumberofwheels() {
        return numberofwheels;
    }

    public void setNumberofwheels(int numberofwheels) {
        this.numberofwheels = numberofwheels;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public car1(){}
    public car1(int numberofwheels ,float height ,float weight){
         this.numberofwheels=numberofwheels;
         this.height=height;
         this.weight=weight;
        
    }
    abstract void autopilot();
    abstract void streamingservices();
    abstract void pakingsinsors();
}

