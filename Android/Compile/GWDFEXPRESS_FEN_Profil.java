/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_Profil
 * Date : 07/02/2017 19:08:02
 * Version de wdjava.dll  : 21.0.118.0
 */


package com.masociete.express_my_achievements.wdgen;


import com.masociete.express_my_achievements.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.superchamp.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_Profil extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_Profil
////////////////////////////////////////////////////////////////////////////

/**
 * SC_Bertrand
 */
class GWDSC_Bertrand extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Profil.SC_Bertrand
////////////////////////////////////////////////////////////////////////////

/**
 * SC_Hardware
 */
class GWDSC_Hardware extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Profil.SC_Bertrand.SC_Hardware
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Profil.SC_Bertrand.SC_Hardware.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747190931261l);

super.setChecksum("796830429");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(277, 8);

super.setTailleInitiale(29, 26);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("FontAwesome", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom1 mWD_LIB_SansNom1 = new GWDLIB_SansNom1();

/**
 * LIB_SansNom2
 */
class GWDLIB_SansNom2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Profil.SC_Bertrand.SC_Hardware.LIB_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747190996797l);

super.setChecksum("796895965");

super.setNom("LIB_SansNom2");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Hardware");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(277, 42);

super.setTailleInitiale(29, 260);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("MS Shell Dlg", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom2 mWD_LIB_SansNom2 = new GWDLIB_SansNom2();

/**
 * BTN_tour_icon
 */
class GWDBTN_tour_icon extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Profil.SC_Bertrand.SC_Hardware.BTN_tour_icon
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191062333l);

super.setChecksum("796961957");

super.setNom("BTN_tour_icon");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(314, 42);

super.setTailleInitiale(27, 24);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_tour_icon ( SC_Hardware )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "Assemblage d'une tour", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("Assemblage d'une tour"),new WDChaineU(""),mWD_SC_Bertrand.mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_tour_icon mWD_BTN_tour_icon = new GWDBTN_tour_icon();
/**
 * Initialise tous les champs de EXPRESS_FEN_Profil.SC_Bertrand.SC_Hardware
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Profil.SC_Bertrand.SC_Hardware
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_LIB_SansNom2.initialiserObjet();
super.ajouter("LIB_SansNom2", mWD_LIB_SansNom2);
mWD_BTN_tour_icon.initialiserObjet();
super.ajouter("BTN_tour_icon", mWD_BTN_tour_icon);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747190865725l);

super.setChecksum("796781765");

super.setNom("SC_Hardware");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNumTab(2);

super.setEtatInitial(0);

super.setPositionInitiale(267, 0);

super.setTailleInitiale(98, 321);

super.setValeurInitiale("");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setPersistant(false);

super.setTailleUtile(321, 98);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFF00FF, 4, 4, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSC_Hardware mWD_SC_Hardware = new GWDSC_Hardware();

/**
 * SC_dev
 */
class GWDSC_dev extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_SansNom2
 */
class GWDLIB_SansNom2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev.LIB_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191193405l);

super.setChecksum("797092573");

super.setNom("LIB_SansNom2");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(153, 8);

super.setTailleInitiale(29, 26);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("FontAwesome", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom2 mWD_LIB_SansNom2 = new GWDLIB_SansNom2();

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191258941l);

super.setChecksum("797158109");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Développement\r\n");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(153, 42);

super.setTailleInitiale(29, 239);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("MS Shell Dlg", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom1 mWD_LIB_SansNom1 = new GWDLIB_SansNom1();

/**
 * BTN_archives
 */
class GWDBTN_archives extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev.BTN_archives
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191324477l);

super.setChecksum("797224101");

super.setNom("BTN_archives");

super.setType(4);

super.setLibelle("Archives de l'Ain");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(227, 76);

super.setTailleInitiale(27, 231);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_archives ( SC_dev )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "Archives de l'Ain", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("Archives de l'Ain"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_archives mWD_BTN_archives = new GWDBTN_archives();

/**
 * BTN_archives_icon
 */
class GWDBTN_archives_icon extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev.BTN_archives_icon
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191390013l);

super.setChecksum("797289637");

super.setNom("BTN_archives_icon");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(227, 44);

super.setTailleInitiale(27, 24);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_archives_icon ( SC_dev )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "Archives de l'Ain", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("Archives de l'Ain"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_archives_icon mWD_BTN_archives_icon = new GWDBTN_archives_icon();

/**
 * BTN_ma
 */
class GWDBTN_ma extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev.BTN_ma
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191455549l);

super.setChecksum("797355173");

super.setNom("BTN_ma");

super.setType(4);

super.setLibelle("My Achievements");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(190, 76);

super.setTailleInitiale(27, 234);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ma ( SC_dev )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "My Achievements", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("My Achievements"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_ma mWD_BTN_ma = new GWDBTN_ma();

/**
 * BTN_archives_icon1
 */
class GWDBTN_archives_icon1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev.BTN_archives_icon1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191521085l);

super.setChecksum("797420709");

super.setNom("BTN_archives_icon1");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(190, 44);

super.setTailleInitiale(27, 24);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_archives_icon1 ( SC_dev )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "My Achievements", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("My Achievements"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_archives_icon1 mWD_BTN_archives_icon1 = new GWDBTN_archives_icon1();
/**
 * Initialise tous les champs de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Profil.SC_Bertrand.SC_dev
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_SansNom2.initialiserObjet();
super.ajouter("LIB_SansNom2", mWD_LIB_SansNom2);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_BTN_archives.initialiserObjet();
super.ajouter("BTN_archives", mWD_BTN_archives);
mWD_BTN_archives_icon.initialiserObjet();
super.ajouter("BTN_archives_icon", mWD_BTN_archives_icon);
mWD_BTN_ma.initialiserObjet();
super.ajouter("BTN_ma", mWD_BTN_ma);
mWD_BTN_archives_icon1.initialiserObjet();
super.ajouter("BTN_archives_icon1", mWD_BTN_archives_icon1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191127869l);

super.setChecksum("797043909");

super.setNom("SC_dev");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNumTab(1);

super.setEtatInitial(0);

super.setPositionInitiale(143, 0);

super.setTailleInitiale(126, 321);

super.setValeurInitiale("");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setPersistant(false);

super.setTailleUtile(321, 126);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0x80FF, 4, 4, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSC_dev mWD_SC_dev = new GWDSC_dev();

/**
 * BTN_tour
 */
class GWDBTN_tour extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Profil.SC_Bertrand.BTN_tour
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191586621l);

super.setChecksum("797486245");

super.setNom("BTN_tour");

super.setType(4);

super.setLibelle("Assemblage d'une tour");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(314, 74);

super.setTailleInitiale(27, 227);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_tour ( SC_Bertrand )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "Assemblage d'une tour", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("Assemblage d'une tour"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_tour mWD_BTN_tour = new GWDBTN_tour();
/**
 * Initialise tous les champs de EXPRESS_FEN_Profil.SC_Bertrand
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Profil.SC_Bertrand
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_SC_Hardware.initialiserObjet();
super.ajouter("SC_Hardware", mWD_SC_Hardware);
mWD_SC_dev.initialiserObjet();
super.ajouter("SC_dev", mWD_SC_dev);
mWD_BTN_tour.initialiserObjet();
super.ajouter("BTN_tour", mWD_BTN_tour);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747190800189l);

super.setChecksum("796716229");

super.setNom("SC_Bertrand");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNumTab(1);

super.setEtatInitial(0);

super.setPositionInitiale(143, 0);

super.setTailleInitiale(242, 320);

super.setValeurInitiale("");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000);

super.setPersistant(false);

super.setTailleUtile(320, 242);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSC_Bertrand mWD_SC_Bertrand;

/**
 * LIB_nom
 */
class GWDLIB_nom extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Profil.LIB_nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191717725l);

super.setChecksum("797616893");

super.setNom("LIB_nom");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Bertrand Choubert");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(106, 8);

super.setTailleInitiale(29, 304);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("MS Shell Dlg", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_nom mWD_LIB_nom;

/**
 * IMG_picture
 */
class GWDIMG_picture extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Profil.IMG_picture
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358747191848812l);

super.setChecksum("797750260");

super.setNom("IMG_picture");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(8, 104);

super.setTailleInitiale(90, 95);

super.setValeurInitiale("D:\\Mes Projets Mobile\\EXPRESS_MY_ACHIEVEMENTS\\profilepicture.png");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(4, 1000, 1000, 500, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 1, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_picture mWD_IMG_picture;

/**
 * IMG_picture1
 */
class GWDIMG_picture1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Profil.IMG_picture1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358944761373390l);

super.setChecksum("798779268");

super.setNom("IMG_picture1");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(8, 104);

super.setTailleInitiale(90, 95);

super.setValeurInitiale("D:\\Mes Projets Mobile\\EXPRESS_MY_ACHIEVEMENTS\\profilepicture.png");

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 500, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 1, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_picture1 mWD_IMG_picture1;

/**
 * LIB_nom1
 */
class GWDLIB_nom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_Profil.LIB_nom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925358983416744164l);

super.setChecksum("799442107");

super.setNom("LIB_nom1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Damien Claras");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(104, 8);

super.setTailleInitiale(29, 304);

super.setPlan(2);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("MS Shell Dlg", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_nom1 mWD_LIB_nom1;

/**
 * SC_Damien
 */
class GWDSC_Damien extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_Profil.SC_Damien
////////////////////////////////////////////////////////////////////////////

/**
 * SC_Hardware
 */
class GWDSC_Hardware extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Profil.SC_Damien.SC_Hardware
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Profil.SC_Damien.SC_Hardware.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917426925749l);

super.setChecksum("721613282");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(275, 8);

super.setTailleInitiale(29, 26);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("FontAwesome", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom1 mWD_LIB_SansNom1 = new GWDLIB_SansNom1();

/**
 * LIB_SansNom2
 */
class GWDLIB_SansNom2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Profil.SC_Damien.SC_Hardware.LIB_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917426991285l);

super.setChecksum("721678818");

super.setNom("LIB_SansNom2");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Jeux");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(275, 42);

super.setTailleInitiale(29, 260);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("MS Shell Dlg", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom2 mWD_LIB_SansNom2 = new GWDLIB_SansNom2();

/**
 * BTN_tour_icon
 */
class GWDBTN_tour_icon extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Profil.SC_Damien.SC_Hardware.BTN_tour_icon
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427056821l);

super.setChecksum("721744810");

super.setNom("BTN_tour_icon");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(312, 42);

super.setTailleInitiale(27, 24);

super.setPlan(2);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_tour_icon ( SC_Hardware )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "Assemblage d'une tour", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("Assemblage d'une tour"),new WDChaineU(""),mWD_SC_Damien.mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_tour_icon mWD_BTN_tour_icon = new GWDBTN_tour_icon();
/**
 * Initialise tous les champs de EXPRESS_FEN_Profil.SC_Damien.SC_Hardware
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Profil.SC_Damien.SC_Hardware
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_LIB_SansNom2.initialiserObjet();
super.ajouter("LIB_SansNom2", mWD_LIB_SansNom2);
mWD_BTN_tour_icon.initialiserObjet();
super.ajouter("BTN_tour_icon", mWD_BTN_tour_icon);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917426860213l);

super.setChecksum("721564618");

super.setNom("SC_Hardware");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNumTab(2);

super.setEtatInitial(0);

super.setPositionInitiale(265, 0);

super.setTailleInitiale(98, 321);

super.setValeurInitiale("");

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setPersistant(false);

super.setTailleUtile(321, 98);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0x9B, 4, 4, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSC_Hardware mWD_SC_Hardware = new GWDSC_Hardware();

/**
 * SC_dev
 */
class GWDSC_dev extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Profil.SC_Damien.SC_dev
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_SansNom2
 */
class GWDLIB_SansNom2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Profil.SC_Damien.SC_dev.LIB_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427187893l);

super.setChecksum("721875426");

super.setNom("LIB_SansNom2");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(151, 8);

super.setTailleInitiale(29, 26);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("FontAwesome", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom2 mWD_LIB_SansNom2 = new GWDLIB_SansNom2();

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Profil.SC_Damien.SC_dev.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427253429l);

super.setChecksum("721940962");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Créations\r\n");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(151, 42);

super.setTailleInitiale(29, 239);

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("MS Shell Dlg", -12.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom1 mWD_LIB_SansNom1 = new GWDLIB_SansNom1();

/**
 * BTN_archives
 */
class GWDBTN_archives extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Profil.SC_Damien.SC_dev.BTN_archives
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427318965l);

super.setChecksum("722006954");

super.setNom("BTN_archives");

super.setType(4);

super.setLibelle("Jeux de société");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(225, 76);

super.setTailleInitiale(27, 231);

super.setPlan(2);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_archives ( SC_dev )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "Jeux de société", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("Jeux de société"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_archives mWD_BTN_archives = new GWDBTN_archives();

/**
 * BTN_archives_icon
 */
class GWDBTN_archives_icon extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Profil.SC_Damien.SC_dev.BTN_archives_icon
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427384501l);

super.setChecksum("722072490");

super.setNom("BTN_archives_icon");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(225, 44);

super.setTailleInitiale(27, 24);

super.setPlan(2);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_archives_icon ( SC_dev )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "Jeux de société", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("Jeux de société"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_archives_icon mWD_BTN_archives_icon = new GWDBTN_archives_icon();

/**
 * BTN_ma
 */
class GWDBTN_ma extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_Profil.SC_Damien.SC_dev.BTN_ma
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427450037l);

super.setChecksum("722138026");

super.setNom("BTN_ma");

super.setType(4);

super.setLibelle("NaNoWriMo");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(188, 76);

super.setTailleInitiale(27, 234);

super.setPlan(2);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ma ( SC_dev )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "NaNoWriMo", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("NaNoWriMo"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_ma mWD_BTN_ma = new GWDBTN_ma();

/**
 * BTN_archives_icon1
 */
class GWDBTN_archives_icon1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_Profil.SC_Damien.SC_dev.BTN_archives_icon1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427515573l);

super.setChecksum("722203562");

super.setNom("BTN_archives_icon1");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(188, 44);

super.setTailleInitiale(27, 24);

super.setPlan(2);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("FontAwesome", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_archives_icon1 ( SC_dev )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "NaNoWriMo", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("NaNoWriMo"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_archives_icon1 mWD_BTN_archives_icon1 = new GWDBTN_archives_icon1();
/**
 * Initialise tous les champs de EXPRESS_FEN_Profil.SC_Damien.SC_dev
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Profil.SC_Damien.SC_dev
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_SansNom2.initialiserObjet();
super.ajouter("LIB_SansNom2", mWD_LIB_SansNom2);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_BTN_archives.initialiserObjet();
super.ajouter("BTN_archives", mWD_BTN_archives);
mWD_BTN_archives_icon.initialiserObjet();
super.ajouter("BTN_archives_icon", mWD_BTN_archives_icon);
mWD_BTN_ma.initialiserObjet();
super.ajouter("BTN_ma", mWD_BTN_ma);
mWD_BTN_archives_icon1.initialiserObjet();
super.ajouter("BTN_archives_icon1", mWD_BTN_archives_icon1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427122357l);

super.setChecksum("721826762");

super.setNom("SC_dev");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNumTab(1);

super.setEtatInitial(0);

super.setPositionInitiale(141, 0);

super.setTailleInitiale(126, 321);

super.setValeurInitiale("");

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setPersistant(false);

super.setTailleUtile(321, 126);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xC08000, 4, 4, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSC_dev mWD_SC_dev = new GWDSC_dev();

/**
 * BTN_tour
 */
class GWDBTN_tour extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Profil.SC_Damien.BTN_tour
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917427581109l);

super.setChecksum("722269098");

super.setNom("BTN_tour");

super.setType(4);

super.setLibelle("Supergiant Game");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(312, 74);

super.setTailleInitiale(27, 227);

super.setPlan(2);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xF4000000, 0x0, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_tour ( SC_Damien )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_FEN_Achievement, "Supergiant Game", "", SC_dev..CouleurFond)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Achievement,new WDObjet[] {new WDChaineU("Supergiant Game"),new WDChaineU(""),mWD_SC_dev.getCouleurFond()} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_tour mWD_BTN_tour = new GWDBTN_tour();
/**
 * Initialise tous les champs de EXPRESS_FEN_Profil.SC_Damien
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Profil.SC_Damien
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_SC_Hardware.initialiserObjet();
super.ajouter("SC_Hardware", mWD_SC_Hardware);
mWD_SC_dev.initialiserObjet();
super.ajouter("SC_dev", mWD_SC_dev);
mWD_BTN_tour.initialiserObjet();
super.ajouter("BTN_tour", mWD_BTN_tour);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925663917426794677l);

super.setChecksum("721499082");

super.setNom("SC_Damien");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNumTab(2);

super.setEtatInitial(0);

super.setPositionInitiale(141, 0);

super.setTailleInitiale(242, 320);

super.setValeurInitiale("");

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(6);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000);

super.setPersistant(false);

super.setTailleUtile(320, 242);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSC_Damien mWD_SC_Damien;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de EXPRESS_FEN_Profil.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2923764516723370437l);

super.setChecksum("2059631475");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(96, 96);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_Profil.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Profil.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0xE5B533, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de EXPRESS_FEN_Profil
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_item = WD_tabParam[0];
}
else { vWD_item = null; erreurPassageParametreFenetre(WD_ntabParamLen, 1); }
super.ajouterVariableGlobale("item",vWD_item);

// Traitement du paramètre n°1
if(1<WD_ntabParamLen) 
{
vWD_image = WD_tabParam[1];
}
else { vWD_image = null; erreurPassageParametreFenetre(WD_ntabParamLen, 2); }
super.ajouterVariableGlobale("image",vWD_image);


}




/**
 * Traitement: Fin d'initialisation de EXPRESS_FEN_Profil
 */
public void init()
{
super.init();

// EXPRESS_FEN_Profil..Plan = item;
GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Profil.setPlan(vWD_item);

// SC_Bertrand..Visible = Faux
mWD_SC_Bertrand.setVisible(false);

// SC_Damien..Visible = Faux
mWD_SC_Damien.setVisible(false);

// SI item = 1 ALORS
if(vWD_item.opEgal(1))
{
// 	IMG_picture = image
mWD_IMG_picture.setValeur(vWD_image);

// 	SC_Bertrand..Visible = Vrai
mWD_SC_Bertrand.setVisible(true);

}

// SI item = 2 ALORS
if(vWD_item.opEgal(2))
{
// 	IMG_picture1 = image
mWD_IMG_picture1.setValeur(vWD_image);

// 	SC_Damien..Visible = Vrai
mWD_SC_Damien.setVisible(true);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_item = WDVarNonAllouee.ref;
 public WDObjet vWD_image = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FEN_Profil
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SC_Bertrand = new GWDSC_Bertrand();
mWD_LIB_nom = new GWDLIB_nom();
mWD_IMG_picture = new GWDIMG_picture();
mWD_IMG_picture1 = new GWDIMG_picture1();
mWD_LIB_nom1 = new GWDLIB_nom1();
mWD_SC_Damien = new GWDSC_Damien();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_Profil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2923764516723304901l);

super.setChecksum("2063964580");

super.setNom("EXPRESS_FEN_Profil");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(408, 320);

super.setTitre("MY ACHIEVEMENTS");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Profil
////////////////////////////////////////////////////////////////////////////
mWD_SC_Bertrand.initialiserObjet();
super.ajouter("SC_Bertrand", mWD_SC_Bertrand);
mWD_LIB_nom.initialiserObjet();
super.ajouter("LIB_nom", mWD_LIB_nom);
mWD_IMG_picture.initialiserObjet();
super.ajouter("IMG_picture", mWD_IMG_picture);
mWD_IMG_picture1.initialiserObjet();
super.ajouter("IMG_picture1", mWD_IMG_picture1);
mWD_LIB_nom1.initialiserObjet();
super.ajouter("LIB_nom1", mWD_LIB_nom1);
mWD_SC_Damien.initialiserObjet();
super.ajouter("SC_Damien", mWD_SC_Damien);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Profil;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "";
}
}
