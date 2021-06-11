package cn.edu.cqu.domains;

/***********************************************************************
 * Module:  AcademicNews.java
 * Author:  Guo
 * Purpose: Defines the Class AcademicNews
 ***********************************************************************/


/** @pdOid 520f3e7a-ae53-4b67-91b1-bfdd339294f8 */
public class AcademicNews {
   /** @pdOid 72a2508d-e716-43dc-b756-8a9e8ddda21b */
   public int aNewsID;
   /** @pdOid ab879eb6-8def-4209-9851-9d6074f76582 */
   public java.util.Date aNewsDate;
   /** @pdOid 6face4d6-0b54-437d-b855-8841ffc7b0e6 */
   public java.lang.String aNewsURL;
   /** @pdOid ea665ca3-b2ba-46b2-ba0b-ea6447001e4d */
   public java.lang.String aNewsImgURL;
   /** @pdOid 619b15ca-19cb-444e-91e9-40c038bc5541 */
   public java.lang.String aNewsContent;
   
   /** @pdRoleInfo migr=no name=Admin assc=reference4 mult=0..1 side=A */
   public Admin admin;
   
   
   /** @pdGenerated default parent getter */
   public Admin getAdmin() {
      return admin;
   }
   
}