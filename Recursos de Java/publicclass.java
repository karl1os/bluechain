 package org.wikibooks.java;
 
 public class Length {
    private String units;
 
    public Length(String units) {
      if ((units == null) || (units.trim().length() == 0)) {
         throw new IllegalArgumentException("non-null, non-empty units required.");
      }
      
     this.units = units;
   } 
     
   public String getUnits() {
   return units;
   }
 }