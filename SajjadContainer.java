public class SajjadContainer{
    private int[] data;
    private int currentPosition; 

    public SajjadContainer(int[] userData, int userCurrentPosition){
        data = userData;
        currentPosition = userCurrentPosition;
    }
    public SajjadContainer(){
        data = new int[10];
        currentPosition = 0;
    }

    public int[] getData(){
        return data;
    }
    public void setData(int[] inputData){
        data = inputData;
    }
    public int getCurrentPosition(){
        return currentPosition;
    }
    public void setCurrentPosition(int inputCurrentPosition){
        currentPosition = inputCurrentPosition;
    }

    public void add(int value){
        if(currentPosition >= data.length){
            grow();
        }
        data[currentPosition] = value;
        currentPosition++; 
    }
    //grows the array if the array is running out of space
    public void grow(){
        int[] newArray = new int[data.length * 2]; 
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray; 
    }
    //adds a new value to a specific position
    public void add(int position, int value){
        if(currentPosition >= data.length){
            grow();
        }

        for(int i = currentPosition; i > position; i--){
           data[i] = data[i-1]; 
        }
        data[position] = value;
        currentPosition++;

    }
    //removes a specific element at a specific index 
    public void remove(int position){
        for (int i = position; i < currentPosition - 1; i++){
            data[i] = data[i + 1];
        }
        currentPosition--;
    }
    
    public void removeFirst(){
        for(int i = 0; i < currentPosition; i++){
            data[i] = data[i + 1];
        }
        currentPosition--;
    }
    public void removeLast(){
        for(int i = 0; i > currentPosition; i++){
            data[i] = data[i + 1];
        }
        currentPosition--;
    }
    public void clear(){
        int[] newArray = new int[data.length];
        data = newArray;
        currentPosition = 0; 
    }
    
    public void replace(int position, int value){
        data[position] = value;

    }
    public void addFirst(int value){
        for(int i = currentPosition; i > 0; i--){
            data[i] = data[i-1];
        }
        data[0] = value;
        currentPosition++;
    }
    public void sizeofContainer(){
        System.out.println("Size: " + currentPosition);
    }
    public void getPositionOfElement(int position){
        System.out.println(data[position]);
    }
    public boolean isEmpty(){
        if(currentPosition <= 0){
            return true;
        } else{
            return false;
        }
        
    }
    public void show(){
        for(int i = 0; i < currentPosition; i++){
            System.out.println(data[i]);
        }
    }
}