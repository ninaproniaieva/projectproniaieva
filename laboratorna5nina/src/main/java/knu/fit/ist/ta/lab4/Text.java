/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 *
 * @author skinf
 */
@Component
public class Text {
    public static String text;
    static Matcher matcher;
    static Pattern pattern;
    
    public Text(){
          text = "The Internet of Things, or IoT, refers to the billions of physical devices around the world that are now connected to the internet, all collecting and sharing data. Thanks to the arrival of super-cheap computer chips and the ubiquity of wireless networks, it's possible to turn anything, from something as small as a pill to something as big as an aeroplane, into a part of the IoT. Connecting up all these different objects and adding sensors to them adds a level of digital intelligence to devices that would be otherwise dumb, enabling them to communicate real-time data without involving a human being. The Internet of Things is making the fabric of the world around us more smarter and more responsive, merging the digital and physical universes. How big is the Internet of Things? Big and getting bigger -- there are already more connected things than people in the world.\n" +
"Tech analyst company IDC predicts that in total there will be 41.6 billion connected IoT devices by 2025, or \"things.\" It also suggests industrial and automotive equipment represent the largest opportunity of connected \"things,\", but it also sees strong adoption of smart home and wearable devices in the near term.  \n" +
"Another tech analyst, Gartner, predicts that the enterprise and automotive sectors will account for 5.8 billion devices this year, up almost a quarter on 2019. Utilities will be the highest user of IoT, thanks to the continuing rollout of smart meters. Security devices, in the form of intruder detection and web cameras will be the second biggest use of IoT devices. Building automation – like connected lighting – will be the fastest growing sector, followed by automotive (connected cars) and healthcare (monitoring of chronic conditions). The benefits of the IoT for business depend on the particular implementation; agility and efficiency are usually top considerations. ";
}
    
    public static String cleanText(String ctext){
        
        ctext = ctext.toLowerCase();
        ctext = ctext.replaceAll("\\bthe|and\\b", "").trim();
        ctext = ctext.replaceAll("\\b\\w{1,2}\\b", "").trim();
        ctext = ctext.replaceAll("[^\\w -]", "").trim();
        ctext = ctext.replaceAll("-{2,}","");
        ctext = ctext.replaceAll(" {2,}"," ");
        return ctext;
    }
    
    public static List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }
    
    public static int sizeOfList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result.size();
    }
    
    public static Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }
    
    public static int sizeOfSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result.size();
    }
    
    public static ArrayList<String> first7Often(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        ArrayList<String> result = new ArrayList<String>();
        
        int size = words.size();
        int m = 7; // m - the number of words to perform calculations for
        int[] z = new int[size]; 
        // z[i] - frequency of occurrence of the word with serial number i
        int[] n = new int[m];
        int[] t = new int[m];
        for(int j=0;j<size;++j){
            z[j]=0;
            for(int i=0; i<size ;++i){
                    
                if(words.get(j).equals(words.get(i))){
                    z[j]=z[j]+1;
                }
                
            }
            for(int q=0;q<j;++q){   //avoid the same words
                if(words.get(j).equals(words.get(q))) z[j]=0;
            }
        }
            
        for(int j=0; j<m;++j){
            for(int i=0;i<size;++i){
                   
                if(z[i]>t[j]){
                    t[j]=z[i];  //the highest frequency of occurence 
                    n[j]=i;     //the serial number of the word
                }   
                    
            }
            z[n[j]]=0;  //not to repeat words
        }
        for(int y=0;y<m;++y){
            result.add(words.get(n[y])+" - "+t[y]);
        }
        
        return result;
    }
    
    public static int notU(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-tv-z]+\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public static int words4Letters(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-z]{4}\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public static ArrayList<String> seq3Let(String text){
        int p = 0;
        String stext = text;
        String fseq;       
        
        int t=0, m=6, d=0; // m - the number of sequences to perform calculations with
        // d - so as not to repeat the sequence, t - frequency of occurrence
        String seq="";     
        ArrayList<String> all = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        
        for(int q=0;q<m;++q){
            t=0;
            for(int i=3, j=0;i<text.length();++i){
                p=0;
                d=0;
                if(stext.charAt(i-1)==' '){
                    i += 3;
                    j += 3;
                }
                fseq = stext.substring(j, i);
                for(int z=0;z<q;++z){
                    if(fseq.equals(all.get(z))){d = 1;}
                }
                pattern = Pattern.compile(fseq);
                matcher = pattern.matcher(text);
                while(matcher.find() && d!=1){
                    ++p;
                }
                if(p>t){t=p;seq=fseq;}
                ++j;
            }
            all.add(seq);
            result.add(seq+" - "+t);
            }
        return result;
    }
}
    
