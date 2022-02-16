package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList {
    // the number of attempted element insertions
    private int totalAdded;
    private SortedIntList list;

    public DelegationSortedIntList() {
        list = new SortedIntList();
    }
    /**
     * Gets the total number of attempted int insertions to the list since it.
     * was created.
     *
     * @return total number of integers added to the list.
     */
    public int getTotalAdded()
    {
        return totalAdded;
    }

    public boolean add(int num) {
        totalAdded += 1;
        return list.add(num);
    }

    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return list.addAll(list);
    }
}