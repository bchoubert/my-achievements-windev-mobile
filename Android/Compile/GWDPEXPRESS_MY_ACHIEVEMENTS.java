/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Projet
 * Classe Android : EXPRESS_MY_ACHIEVEMENTS
 * Date : 07/02/2017 19:13:38
 * Version de wdjava.dll  : 21.0.118.0
 */


package com.masociete.express_my_achievements.wdgen;


import com.masociete.express_my_achievements.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPEXPRESS_MY_ACHIEVEMENTS extends WDProjet
{
/**
 * Accès au projet: EXPRESS_MY_ACHIEVEMENTS
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project
 */
public static GWDPEXPRESS_MY_ACHIEVEMENTS ms_Project;

 // EXPRESS_FEN_Search
public GWDFEXPRESS_FEN_Search mWD_EXPRESS_FEN_Search = new GWDFEXPRESS_FEN_Search();
 // accesseur de EXPRESS_FEN_Search
public GWDFEXPRESS_FEN_Search getEXPRESS_FEN_Search()
{
mWD_EXPRESS_FEN_Search.verifierOuverte();
return mWD_EXPRESS_FEN_Search;
}

 // EXPRESS_FEN_Profil
public GWDFEXPRESS_FEN_Profil mWD_EXPRESS_FEN_Profil = new GWDFEXPRESS_FEN_Profil();
 // accesseur de EXPRESS_FEN_Profil
public GWDFEXPRESS_FEN_Profil getEXPRESS_FEN_Profil()
{
mWD_EXPRESS_FEN_Profil.verifierOuverte();
return mWD_EXPRESS_FEN_Profil;
}

 // EXPRESS_FEN_Achievement
public GWDFEXPRESS_FEN_Achievement mWD_EXPRESS_FEN_Achievement = new GWDFEXPRESS_FEN_Achievement();
 // accesseur de EXPRESS_FEN_Achievement
public GWDFEXPRESS_FEN_Achievement getEXPRESS_FEN_Achievement()
{
mWD_EXPRESS_FEN_Achievement.verifierOuverte();
return mWD_EXPRESS_FEN_Achievement;
}


 // Constructeur de la classe GWDPEXPRESS_MY_ACHIEVEMENTS
public GWDPEXPRESS_MY_ACHIEVEMENTS()
{
ajouterFenetre("EXPRESS_FEN_Search", mWD_EXPRESS_FEN_Search);
ajouterFenetre("EXPRESS_FEN_Profil", mWD_EXPRESS_FEN_Profil);
ajouterFenetre("EXPRESS_FEN_Achievement", mWD_EXPRESS_FEN_Achievement);

}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static
{
// Allocation de l'objet global
GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project = new GWDPEXPRESS_MY_ACHIEVEMENTS();

// Définition des langues du projet
GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.setLangueProjet(new int[] {1}, new int[] {0}, 1, false);
GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.setNomCollectionProcedure(new String[]{});
}
public String getVersionApplication(){ return "0.0.17.0";}
public String getNomSociete(){ return "";}
public String getNomAPK(){ return "EXPRESS_MY_ACHIEVEMENTS";}
public int getIdNomApplication(){return com.masociete.express_my_achievements.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.express_my_achievements";}
public int getIdIconeApplication(){ return com.masociete.express_my_achievements.R.drawable.i_c_o_n_e________0;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 24;
case HAUTEUR_BARRE_TITRE : return 48;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 480;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("D:\\MES PROJETS MOBILE\\EXPRESS_MY_ACHIEVEMENTS\\LOGO.PNG",com.masociete.express_my_achievements.R.drawable.logo_5+23, "");
super.ajouterFichierAssocie("D:\\MES PROJETS MOBILE\\EXPRESS_MY_ACHIEVEMENTS\\IOS_ZR_ARROW.PNG",com.masociete.express_my_achievements.R.drawable.ios_zr_arrow_4+23, "");
super.ajouterFichierAssocie("D:\\MES PROJETS MOBILE\\EXPRESS_MY_ACHIEVEMENTS\\DAMIEN.PNG",com.masociete.express_my_achievements.R.drawable.damien_3+23, "");
super.ajouterFichierAssocie("D:\\MES PROJETS MOBILE\\EXPRESS_MY_ACHIEVEMENTS\\BERTRAND (1).PNG",com.masociete.express_my_achievements.R.drawable.bertrand__1__2+23, "");
super.ajouterFichierAssocie("D:\\MES PROJETS MOBILE\\EXPRESS_MY_ACHIEVEMENTS\\PROFILEPICTURE.PNG",com.masociete.express_my_achievements.R.drawable.profilepicture_1+23, "");
super.ajouterPolicePerso("FontAwesome","fontawesome_webfont_1.ttf");
super.ajouterPolicePerso("FontAwesome","fontawesome_webfont_1.ttf");
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPEXPRESS_MY_ACHIEVEMENTS_InitProjet( String [] args)
{
GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.initialiserProjet("EXPRESS_MY_ACHIEVEMENTS", "Application Android", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPEXPRESS_MY_ACHIEVEMENTS_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPEXPRESS_MY_ACHIEVEMENTS_InitProjet(null);
}
public void run()
{

GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.lancerProjet();
}
}
}
