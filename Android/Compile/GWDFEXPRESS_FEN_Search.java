/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_Search
 * Date : 07/02/2017 19:08:02
 * Version de wdjava.dll  : 21.0.118.0
 */


package com.masociete.express_my_achievements.wdgen;


import com.masociete.express_my_achievements.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.dessin.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_Search extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_Search
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_rechercheProfil
 */
class GWDSAI_rechercheProfil extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Search.SAI_rechercheProfil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,237,40);
super.setQuid(2923756300439583911l);

super.setChecksum("2048279828");

super.setNom("SAI_rechercheProfil");

super.setType(20001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(44, 237);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(0);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), 4);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE5B533, 0x653500, 0xFFFFFFFF, 4, 4, 1, 1));

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0xE5B533, 0x653500, 0xF4800000, 4, 4, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0));

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
public GWDSAI_rechercheProfil mWD_SAI_rechercheProfil;

/**
 * BTN_recherche
 */
class GWDBTN_recherche extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Search.BTN_recherche
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2923756300439649447l);

super.setChecksum("2048346276");

super.setNom("BTN_recherche");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 253);

super.setTailleInitiale(44, 59);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xE5B533, creerPolice_GEN("FontAwesome", -11.000000, 0));

super.setStyleLibelleSurvol(0xE5B533, creerPolice_GEN("FontAwesome", -11.000000, 0));

super.setStyleLibelleEnfonce(0xE5B533, creerPolice_GEN("FontAwesome", -11.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 4, 4, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 4, 4, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_recherche
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sTextDeRechecheEXPRESS = new WDChaineU();



// sTextDeRechecheEXPRESS est une chaîne;


// sTextDeRechecheEXPRESS = SAI_rechercheProfil;
vWD_sTextDeRechecheEXPRESS.setValeur(mWD_SAI_rechercheProfil);

// ZM_profils..Visible = Vrai;
mWD_ZM_profils.setVisible(true);

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
public GWDBTN_recherche mWD_BTN_recherche;

/**
 * ZM_profils
 */
class GWDZM_profils extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Search.ZM_profils
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_profils_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Search.ZM_profils
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Libellé1
 */
class GWDLIB_Libelle1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Search.ZM_profils.LIB_Libellé1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925336065367284638l);

super.setChecksum("695468701");

super.setNom("LIB_Libellé1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Bertrand Choubert\r\n");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(13, 48);

super.setTailleInitiale(20, 233);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(32768);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Arial", -8.000000, 1), 3);

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
public GWDLIB_Libelle1 mWD_LIB_Libelle1 = new GWDLIB_Libelle1();

/**
 * IMG_Vignette
 */
class GWDIMG_Vignette extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Search.ZM_profils.IMG_Vignette
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925336065367612333l);

super.setChecksum("695798676");

super.setNom("IMG_Vignette");

super.setType(8);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(5, 8);

super.setTailleInitiale(34, 34);

super.setValeurInitiale("D:\\Mes Projets Mobile\\EXPRESS_MY_ACHIEVEMENTS\\bertrand (1).png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(1, 1000, 1000, 1000, 500);

super.setTransparence(1);

super.setParamImage(2097160, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(true);

super.setOrientationExif(true);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 0, 1));


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
public GWDIMG_Vignette mWD_IMG_Vignette = new GWDIMG_Vignette();

/**
 * IMG_Puce
 */
class GWDIMG_Puce extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Search.ZM_profils.IMG_Puce
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925336065367940013l);

super.setChecksum("696126356");

super.setNom("IMG_Puce");

super.setType(8);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 283);

super.setTailleInitiale(45, 10);

super.setValeurInitiale("D:\\Mes Projets Mobile\\EXPRESS_MY_ACHIEVEMENTS\\iOS_ZR_Arrow.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(6, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(2097162, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 0, 1));


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
public GWDIMG_Puce mWD_IMG_Puce = new GWDIMG_Puce();
class GWDZM_profils_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de EXPRESS_FEN_Search.ZM_profils
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Search.ZM_profils
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_Libelle1.initialiserObjet();
super.ajouterChamp(mWD_LIB_Libelle1);
mWD_IMG_Vignette.initialiserObjet();
super.ajouterChamp(mWD_IMG_Vignette);
mWD_IMG_Puce.initialiserObjet();
super.ajouterChamp(mWD_IMG_Puce);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(46);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_profils_Ligne1 mWD_ZM_profils_Ligne1 = new GWDZM_profils_Ligne1();

/**
 * ZM_profils_Ligne2
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Search.ZM_profils
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Libellé2
 */
class GWDLIB_Libelle2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Search.ZM_profils.LIB_Libellé2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925336065368267709l);

super.setChecksum("696451772");

super.setNom("LIB_Libellé2");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Damien Claras");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(14, 50);

super.setTailleInitiale(20, 231);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(32768);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Arial", -8.000000, 1), 3);

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
public GWDLIB_Libelle2 mWD_LIB_Libelle2 = new GWDLIB_Libelle2();

/**
 * IMG_Vignette1
 */
class GWDIMG_Vignette1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Search.ZM_profils.IMG_Vignette1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925336065368529868l);

super.setChecksum("696716211");

super.setNom("IMG_Vignette1");

super.setType(8);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(5, 8);

super.setTailleInitiale(36, 36);

super.setValeurInitiale("D:\\Mes Projets Mobile\\EXPRESS_MY_ACHIEVEMENTS\\damien.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(1, 1000, 1000, 1000, 500);

super.setTransparence(1);

super.setParamImage(2097160, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(true);

super.setOrientationExif(true);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 0, 1));


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
public GWDIMG_Vignette1 mWD_IMG_Vignette1 = new GWDIMG_Vignette1();

/**
 * IMG_Puce1
 */
class GWDIMG_Puce1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Search.ZM_profils.IMG_Puce1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2925336065368857548l);

super.setChecksum("697043891");

super.setNom("IMG_Puce1");

super.setType(8);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 283);

super.setTailleInitiale(47, 10);

super.setValeurInitiale("D:\\Mes Projets Mobile\\EXPRESS_MY_ACHIEVEMENTS\\iOS_ZR_Arrow.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(6, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(2097162, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 0, 1));


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
public GWDIMG_Puce1 mWD_IMG_Puce1 = new GWDIMG_Puce1();
class GWDZM_profils_Ligne2 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de EXPRESS_FEN_Search.ZM_profils
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Search.ZM_profils
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_Libelle2.initialiserObjet();
super.ajouterChamp(mWD_LIB_Libelle2);
mWD_IMG_Vignette1.initialiserObjet();
super.ajouterChamp(mWD_IMG_Vignette1);
mWD_IMG_Puce1.initialiserObjet();
super.ajouterChamp(mWD_IMG_Puce1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(48);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_profils_Ligne2 mWD_ZM_profils_Ligne2 = new GWDZM_profils_Ligne2();
/**
 * Initialise tous les champs de EXPRESS_FEN_Search.ZM_profils
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Search.ZM_profils
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_profils_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_profils_Ligne1);
mWD_ZM_profils_Ligne2.initialiserObjet();
super.ajouterLigne(mWD_ZM_profils_Ligne2);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2925335270797560163l);

super.setChecksum("694736665");

super.setNom("ZM_profils");

super.setType(97);

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(60, 8);

super.setTailleInitiale(94, 304);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setNumTab(3);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -7.000000, 0), -1);

super.setCouleurSeparateur(0xCACACA);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 4, 4, 1, 1));

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xAEA7A1, 0x2E2721, 0xF7F7F7, 9, 9, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xE5B533, 4, 4, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_profils
 */
public void selectionLigne()
{
super.selectionLigne();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_nItemEXPRESS = new WDEntier();

WDObjet vWD_image = WDVarNonAllouee.ref;


// nItemEXPRESS est un entier = ZM_profils;

vWD_nItemEXPRESS.setValeur(this);


// image est une Image;
vWD_image = new WDInstance( new WDImage() );


// SI nItemEXPRESS = 1 ALORS
if(vWD_nItemEXPRESS.opEgal(1))
{
// 	image = ZM_profils.IMG_Vignette..Valeur
vWD_image.setValeur(mWD_IMG_Vignette.getValeur());

}

// SI nItemEXPRESS = 2 ALORS
if(vWD_nItemEXPRESS.opEgal(2))
{
// 	image = ZM_profils.IMG_Vignette1..Valeur
vWD_image.setValeur(mWD_IMG_Vignette1.getValeur());

}

// OuvreFenêtreMobile(EXPRESS_FEN_Profil, nItemEXPRESS, image)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Profil,new WDObjet[] {vWD_nItemEXPRESS,vWD_image} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_profils mWD_ZM_profils;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Search.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2923756300439452839l);

super.setChecksum("2048149212");

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

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_Search.#EXPRESSVersion

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
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Search.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("");

super.setParamBoutonGauche(true, 1, "", "D:\\Mes Projets Mobile\\EXPRESS_MY_ACHIEVEMENTS\\logo.png");

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
 * Traitement: Déclarations globales de EXPRESS_FEN_Search
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FEN_Search
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_rechercheProfil = new GWDSAI_rechercheProfil();
mWD_BTN_recherche = new GWDBTN_recherche();
mWD_ZM_profils = new GWDZM_profils();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_Search
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2923756300439387303l);

super.setChecksum("2052482317");

super.setNom("EXPRESS_FEN_Search");

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
// Initialisation des champs de EXPRESS_FEN_Search
////////////////////////////////////////////////////////////////////////////
mWD_SAI_rechercheProfil.initialiserObjet();
super.ajouter("SAI_rechercheProfil", mWD_SAI_rechercheProfil);
mWD_BTN_recherche.initialiserObjet();
super.ajouter("BTN_recherche", mWD_BTN_recherche);
mWD_ZM_profils.initialiserObjet();
super.ajouter("ZM_profils", mWD_ZM_profils);
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
return GWDPEXPRESS_MY_ACHIEVEMENTS.ms_Project.mWD_EXPRESS_FEN_Search;
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
