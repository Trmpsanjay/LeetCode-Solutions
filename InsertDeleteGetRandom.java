/* 
Algorithm
    Here we have to implement 3 functions insert() , remove() and getRandom() in 0(1) complexity
    first thing that comes to our mind is to use HashMap/HashSet as they provide 0(1) insert and
    0(1) delete.The problem is with getRandom method as how to implement such a method as map doesn't 
    have any indexes.The basis idea to implement such a method is to choose random index and retrieve the 
    element from random index
    
    
    here if we can use hashmap in case of hashmap 
                   Time Complexity
                   insert = O(1);
                   remove = O(1);
                   getRandom = can not be O(1) because there is no index in hashmap so we will
                   not able to achieve that
    
    
    For ArrayList
    
    So the second thing that comes to our mind is to use arraylist as arraylist can provide insert() and
    getRandom() in 0(1) complexity  but cann't provide remove().Removing and element at a random 
    index takes 0(n) time complexity.One important thing to know is thsat the complexity to remove the
    last element in the arraylist is 0(1).In order to tackle the remove method we can create a map which 
    will consist of list values with there index in the list and will try to delete from the end of the list
    is 0(1). so in case a call comes for delete we will follow step 1 to step4



 ArrayList
                    Time Complexity
                    insert = O(1);
                    remove = O(n);    because have to shift later index numbers by 1
                    getRandom = O(1);
                    
                    
ArrayList + Hashmap
                    Time Complexity
                    insert = O(1);
                    remove = O(1);
                    getRandom = O(1);
    Steps  for above ds implementation 
    
    1.we will find the index of the element to be deleted by map using o(1) complexity
    2. we will put the value from  the last index to the index found in step 1 in the arraylist using O(1)
    3. we will remove  the last element from the arraylist  in 0(1) and its entry from in 0(1)
    4. we will finally update the index in the map for the value which has come to index found in step 1 in 0(1)
*/

class RandomizedSet {

    /** Initialize your data structure here. */
    List<Integer> list;
    Map<Integer, Integer> map;
    Random rand; // this will provide a random number
    public RandomizedSet() {
         list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        // check if number exists return false
        if(map.containsKey(val))
            return false;
        list.add(val); // add the value to list
        map.put(val, list.size() - 1); // the index list will be size-1 so put index size-1 and
        //map the value with index
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){ // no element the just return false
            return false;
        }
        int index = map.get(val); // get the index
        int lastElement = list.get(list.size() - 1); // get the value of last index
        list.set(index, lastElement); // set the last element value at index 
        map.put(lastElement, index); // update map with lastelement value  to index
        list.remove(list.size() - 1); // remove the last elemenn from arraylist
        map.remove(val); // remove the value from map also 
        return true;
        
        // all above operations are of 0(1) complexity
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int randNum = rand.nextInt(list.size()); // it will geneate random number bw 0 to size-1
        return list.get(randNum);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
