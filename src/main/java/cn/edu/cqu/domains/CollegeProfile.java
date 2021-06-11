package cn.edu.cqu.domains;

/***********************************************************************
 * Module:  CollegeProfile.java
 * Author:  Guo
 * Purpose: Defines the Class CollegeProfile
 ***********************************************************************/


/** @pdOid fb5d6fbd-d81e-4d4e-b7af-375b77067c6a */
public class CollegeProfile {
   /** @pdOid 5585406c-0250-4b80-a6e0-afe06120bc5b */
   public int cpID;
   /** @pdOid 6dcd1dc5-f25c-4298-9459-06791473db1a */
   public java.lang.String cpURL;
   /** @pdOid d4b6c278-f7aa-4cba-8429-d8cb99846850 */
   public java.lang.String cpImgURL;
   /** @pdOid 8ae47c66-d41d-4e4f-b0dd-fa495ee0615e */
   public java.lang.String cpContent;
   
   /** @pdRoleInfo migr=no name=Admin assc=reference5 mult=0..1 side=A */
   public Admin admin;
   
   
   /** @pdGenerated default parent getter */
   public Admin getAdmin() {
      return admin;
   }

}