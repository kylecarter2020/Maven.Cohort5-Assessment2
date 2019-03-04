package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Object extends Ageable> implements Iterable<Object>{

    private List<Object> shelter;

    public Shelter() {
        shelter = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return this.shelter.size();
    }

    public void add(Object object) {
        this.shelter.add(object);
    }

    public Boolean contains(Object object) {
        return this.shelter.contains(object);
    }

    public void remove(Object object) {
        this.shelter.remove(object);
    }

    public Object get(Integer index) {
        return this.shelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return this.shelter.indexOf(ageable);
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}