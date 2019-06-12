package fifoAnimalShelter;

public class AnimalShelter {

    //front node
    protected Node front;
    //back node;
    protected Node back;

    //Node class that contains value and next node
    protected static class Node {
        //value
        Animal value;
        //pointer to next node
        Node next;

        //Constructors

        public Node(Animal val){
            this.value = val;
            this.next = null;
        }

    }
    //Animal class
    protected static class Animal {
        String type;

        public Animal(String type){
            this.type = type.toLowerCase();
        }
    }

    //Constructor
    public AnimalShelter(){
        this.front = null;
        this.back = null;
    }

    // Method to insert animal object
    public void enqueue(Animal theAnimal){
        if(theAnimal.type.equals("dog") || theAnimal.type.equals("cat")) {
            Node newNode = new Node(theAnimal);
            if (front == null && back == null) {
                front = newNode;
                back = newNode;
            } else {
                back.next = newNode;
                back = newNode;
            }
        } else{
            throw new IllegalArgumentException("Should add a dog or a cat.");
        }
    }

    //Method to remove animal
    public Animal dequeue(String pref){
       Animal result = null;

       if(front != null && (pref.equals("dog") || pref.equals("cat"))){
           result = front.value;
           if(front.value.type.equals(pref)){
               front = front.next;
               return result;
           }
           Node cur = front.next;
           Node prev = front;
           while(cur != null){
               if(cur.value.type == pref){
                   result = cur.value;
                   prev.next = cur.next;
                   cur.next = null;
                   return result;
               }
               prev = cur;
               cur = cur.next;
           }
       }

       return result;
    }

}
