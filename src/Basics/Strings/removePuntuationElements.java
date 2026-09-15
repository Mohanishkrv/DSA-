/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id 94c53b3f-c6c8-44be-96ab-721645dc7f9a
 * @name removePuntuationElements
 * @description
 *
 * @topic
 * @type Normal
 * @difficulty
 * @pattern
 *
 * @companies
 * @source
 * @url
 *
 * @status Unsolved
 * @approach
 * @attempts 0
 * @confidence Low
 * @review
 *
 * @time-complexity
 * @space-complexity
 *
 * @limitations
 * @edge-cases
 */

package String_Problems;

/**
 *
 * @author MOHANISH
 */

/*
Punctuation Elements Are : ! " # $ % & ' ( ) * + , - . / : ; ? @ [ \ ] ^ _ ` { | } ~ 
*/
public class removePuntuationElements {
    public static void main(String[] args) {
        String s="Hello!!!, he said ---and went.";
        System.out.println(s.replaceAll("\\p{Punct}",""));
    }
}
