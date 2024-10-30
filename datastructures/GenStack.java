package grind.datastructures;

public class GenStack<T> {
    private int counter;
    T[] arr;

    public GenStack(){
            this.counter = 0;
            arr = (T[]) new Object[5];
    }


  public void push (T element){
        try{
            if (counter > arr.length - 1) {
                throw new MyOverFlowException("Woah slow down pal, try removing something first.");
            }
            arr[counter] = element;
            counter ++;
        }catch(MyOverFlowException e){
            System.out.println(e.getMessage());
        }
  }

  public void remove(){
        try{
            if(counter == 0){
                throw new myUnderFlowException("Woah slow down pal, can't take what you don't have.");
            }
            arr[counter - 1] = null;
            counter--;
        }catch(myUnderFlowException e){
            System.out.println(e.getMessage());
        }

  }

  public T peak () {
        T peak = null;
        try {
            if (counter > 0) {
                peak = arr[counter - 1];
            } else{
                throw new myUnderFlowException("Bruh, there's nothing here what you looking for?");
            }
        }catch( myUnderFlowException e){
            System.out.println(e.getMessage());
        }
      return peak;
  }

}
