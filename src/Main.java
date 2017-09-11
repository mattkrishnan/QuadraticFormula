/*@author Tushar Balarajan
   CSC 201-004N
   Professor Tanes Kanchanawanchai
   Assignment 3.1


***** BEGIN LICENSE BLOCK *****
        Version: MPL 1.1/GPL 2.0/LGPL 2.1

        The contents of this file are subject to the Mozilla Public License Version
        1.1 (the "License"); you may not use this file except in compliance with
        the License. You may obtain a copy of the License at
        http://www.mozilla.org/MPL/

        Software distributed under the License is distributed on an "AS IS" basis,
        WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
        for the specific language governing rights and limitations under the
        License.

        The Initial Developer of the Original Code is
        Tushar Balarajan.
        Portions created by the Initial Developer are Copyright (C) 2017
        the Initial Developer. All Rights Reserved.

        Contributor(s):

        Alternatively, the contents of this file may be used under the terms of
        either the GNU General Public License Version 2 or later (the "GPL"), or
        the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
        in which case the provisions of the GPL or the LGPL are applicable instead
        of those above. If you wish to allow use of your version of this file only
        under the terms of either the GPL or the LGPL, and not to allow others to
        use your version of this file under the terms of the MPL, indicate your
        decision by deleting the provisions above and replace them with the notice
        and other provisions required by the GPL or the LGPL. If you do not delete
        the provisions above, a recipient may use your version of this file under
        the terms of any one of the MPL, the GPL or the LGPL.

        ***** END LICENSE BLOCK *****
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);

        System.out.println("Given ax^2 + bx + c = 0");
        System.out.println("Please enter 'a', 'b', and 'c' to determine if there are any roots: ");
        float numA = kybd.nextFloat();
        float numB = kybd.nextFloat();
        float numC = kybd.nextFloat();

        quadraticAnswer(numA, numB, numC);

    }

    /**
     *
     * @param <p>numA first number to determine discriminant and using a conditional statement to figure out if there are roots</p>
     * @param <p>numB second number to determine discriminant and using a conditional statement to figure out if there are roots</p>
     * @param <p>numC final number to determine discriminant and using a conditional statement to figure out if there are roots</p>
     */

    public static void quadraticAnswer (float numA, float numB, float numC){
        float discriminant = ((numB*numB)-(4*numA*numC)); //basic equation to determine discriminant

        if (discriminant < 0){
            System.out.println("The Equation has no roots!");
        }

        else if (discriminant ==0) {
            double root = (-numB + Math.sqrt(discriminant))/(2*numA);
            System.out.println("The Equation has one root: "+ root);
        }

        else {
            double root1 = (-numB + Math.sqrt(discriminant))/(2*numA);
            double root2 = (-numB - Math.sqrt(discriminant))/(2*numA);
            System.out.println("The Equation has two roots: " + root1 + " and " + root2 + ".");
        }
    }


}

