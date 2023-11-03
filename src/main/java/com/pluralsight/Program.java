
package com.pluralsight;


import  com.pluralsight.DealershipFileManager.*;

import java.io.IOException;

import static com.pluralsight.DealershipFileManager.getDealership;
import static com.pluralsight.DealershipFileManager.getInventory;

public class Program {
    public static void main(String[] args) throws IOException {
        getDealership();
        getInventory();
    }
}
