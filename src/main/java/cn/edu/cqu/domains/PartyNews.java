package cn.edu.cqu.domains;

/***********************************************************************
 * Module:  PartyNews.java
 * Author:  Guo
 * Purpose: Defines the Class PartyNews
 ***********************************************************************/


/** @pdOid 8e7199db-6f82-4f2f-bd58-5b7217397cd7 */
public class PartyNews {
   /** @pdOid 72b80459-e4c5-4c60-9916-f3b16207ba60 */
   public int pNewsID;
   /** @pdOid 7e1b567f-1a23-47d1-82d8-9d3ae682e82c */
   public java.util.Date pNewsDate;
   /** @pdOid f6cb2782-ff4b-42ac-870f-93fe33dbe912 */
   public java.lang.String pNewsURL;
   /** @pdOid e97991ce-2a8a-4275-b725-5c1e120b1feb */
   public java.lang.String pNewsImgURL;
   /** @pdOid 4f646b85-11c8-42d9-b323-59e6ab49955b */
   public java.lang.String pNewsContent;
   /** @pdOid 54d82c03-6ebf-485c-9188-a31e14b5854c */
   public int pType;
   
   /** @pdRoleInfo migr=no name=Admin assc=reference2 mult=0..1 side=A */
   public Admin admin;
   
   
   /** @pdGenerated default parent getter */
   public Admin getAdmin() {
      return admin;
   }
   
}