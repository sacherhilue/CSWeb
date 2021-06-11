package cn.edu.cqu.domains;

/***********************************************************************
 * Module:  StudyNews.java
 * Author:  Guo
 * Purpose: Defines the Class StudyNews
 ***********************************************************************/

/** @pdOid 78d94ee7-a7b4-4428-bb05-bf608397b59f */
public class StudyNews {
   /** @pdOid 4209b49a-dc8c-4d09-beca-a931bb55a8b1 */
   public int sNewsID;
   /** @pdOid 14493321-835d-48bb-947f-6790f486a91f */
   public java.util.Date sNewsDate;
   /** @pdOid 86d07141-ad54-43cb-90c1-8e820867c2c1 */
   public java.lang.String sNewsURL;
   /** @pdOid 08c71990-8879-49ed-abca-598ffa503daa */
   public java.lang.String sNewsImgURL;
   /** @pdOid e6e0a03c-2f09-4a71-a845-9c8bbdd1cd56 */
   public java.lang.String sNewsContent;
   /** @pdOid 51dc65a7-4a22-41b5-a14e-5ab3794fcfe0 */
   public int sType;
   
   /** @pdRoleInfo migr=no name=Admin assc=reference3 mult=0..1 side=A */
   public Admin admin;
   
   
   /** @pdGenerated default parent getter */
   public Admin getAdmin() {
      return admin;
   }
   
}