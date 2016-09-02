package com.maven.study

import org.junit.Test

/**
 * @author Shashi Bhushan
 *          Created on 2/9/16.
 *          For Project : Maven-Study 
 */

class HelloWorldTest {

    @Test
    public void testPrint(){
        Map<Integer, List<Integer>> map = new TreeMap<>();

        map.put(4, Arrays.asList(1,2,3,4))
        map.put(3, Arrays.asList(5,6,7))
        map.put(8, Arrays.asList(9,10,11,12,13,14,15,16))


        map.eachWithIndex { Map.Entry<Integer, List<Integer>> entry, int i ->
            assert (HelloWorld.getListSize(entry.value) == entry.key)
        }
    }
}
