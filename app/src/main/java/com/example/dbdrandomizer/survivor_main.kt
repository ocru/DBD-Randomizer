package com.example.dbdrandomizer

import android.content.Intent
import android.hardware.lights.Light
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.method.Touch
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView

class survivor_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survivor_main)

        val backButton: Button = findViewById(R.id.surv_back_button)

        val roll: Button = findViewById(R.id.survRollButton)

        backButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        var survivorPerks = SurvivorPerkList(mutableListOf(""))
        survivorPerks.resetList()

        val survivors: MutableList<String> = mutableListOf("Ace","Adam","Ash","Bill","Cheryl","Claudette","David","Dwight","Elodie","Felix","Feng","Haddie","Jake","Jane","Jeff","Jill","Jonah","Kate","Laurie","Leon","Meg","Mikalea","Nancy","Nea","Quentin","Steve","Tapp","Yoichi","Yui","Yun Jin","Zarina")

        var perks = survivorPerks.getList()

        roll.setOnClickListener(){
            selectSurvivor(survivors)
            selectPerks(perks)
            survivorPerks.resetList()
            perks = survivorPerks.getList()


        }



    }
    fun selectSurvivor(list: MutableList<String>) {
        var survivor = list.elementAt((0..list.size - 1).random())
        val survImage: ImageView = findViewById(R.id.survivor)
        val drawableResource = when (survivor) {
            "Ace" -> R.drawable.surv_ace
            "Adam" -> R.drawable.surv_adam
            "Ash" -> R.drawable.surv_ash
            "Bill" -> R.drawable.surv_bill
            "Cheryl" -> R.drawable.surv_cheryl
            "Claudette" -> R.drawable.surv_claudette
            "David" -> R.drawable.surv_david
            "Dwight" -> R.drawable.surv_dwight
            "Elodie" -> R.drawable.surv_elodie
            "Felix" -> R.drawable.surv_felix
            "Feng" -> R.drawable.surv_feng
            "Haddie" -> R.drawable.surv_haddie
            "Jake" -> R.drawable.surv_jake
            "Jane" -> R.drawable.surv_jane
            "Jeff" -> R.drawable.surv_jeff
            "Jill" -> R.drawable.surv_jill
            "Jonah" -> R.drawable.surv_jonah
            "Kate" -> R.drawable.surv_kate
            "Laurie" -> R.drawable.surv_laurie
            "Leon" -> R.drawable.surv_leon
            "Meg" -> R.drawable.surv_meg
            "Mikalea" -> R.drawable.surv_mikalea
            "Nancy" -> R.drawable.surv_nancy
            "Nea" -> R.drawable.surv_nancy
            "Quentin" -> R.drawable.surv_quentin
            "Steve" -> R.drawable.surv_steve
            "Tapp" -> R.drawable.surv_tapp
            "Yoichi" -> R.drawable.surv_yoichi
            "Yui" -> R.drawable.surv_yui
            "Yun Jin" -> R.drawable.surv_yun
            else -> R.drawable.surv_zarina

        }
        survImage.setImageResource(drawableResource)
    }

    fun selectPerks(list: MutableList<String>){
        var perk = ""
        val perkSlot1: ImageView = findViewById(R.id.survPerkSlot1)
        val perkSlot2: ImageView = findViewById(R.id.survPerkSlot2)
        val perkSlot3: ImageView = findViewById(R.id.survPerkSlot3)
        val perkSlot4: ImageView = findViewById(R.id.survPerkSlot4)
        val perk1Text: TextView = findViewById(R.id.perk1)
        val perk2Text: TextView = findViewById(R.id.perk2)
        val perk3Text: TextView = findViewById(R.id.perk3)
        val perk4Text: TextView = findViewById(R.id.perk4)

        for (i in 1..4){
            perk = list.elementAt((0..list.size-1).random())
            var drawableResource = when (perk){
                "Ace in the hole" -> R.drawable.iconperks_aceinthehole
                "Adrenaline" -> R.drawable.iconperks_adrenaline
                "Aftercare" -> R.drawable.iconperks_aftercare
                "Alert" -> R.drawable.iconperks_alert
                "Any Means Necessary" -> R.drawable.iconperks_anymeansnecessary
                "Appraisal" -> R.drawable.iconperks_appraisal
                "Autodidact" -> R.drawable.iconperks_autodidact
                "Balanced Landing" -> R.drawable.iconperks_balancedlanding
                "Better Together" -> R.drawable.iconperks_bettertogether
                "Bit the bullet" -> R.drawable.iconperks_bitethebullet
                "blast mine" -> R.drawable.iconperks_blastmine
                "blood pact" -> R.drawable.iconperks_bloodpact
                "boil over" -> R.drawable.iconperks_boilover
                "bond" -> R.drawable.iconperks_bond
                "boon circle of healing" -> R.drawable.iconperks_booncircleofhealing
                "boon exponetial" -> R.drawable.iconperks_boonexponential
                "boon shadowstep" -> R.drawable.iconperks_boonshadowstep
                "borrowed time" -> R.drawable.iconperks_borrowedtime
                "botany knowledge" -> R.drawable.iconperks_botanyknowledge
                "breakdown" -> R.drawable.iconperks_breakdown
                "breakout" -> R.drawable.iconperks_breakout
                "buckleup" -> R.drawable.iconperks_buckleup
                "built to last" -> R.drawable.iconperks_builttolast
                "calm spirit" -> R.drawable.iconperks_calmspirit
                "camaraderie" -> R.drawable.iconperks_camaraderie
                "clairvoyance" -> R.drawable.iconperks_clairvoyance
                "corrective action" -> R.drawable.iconperks_correctiveaction
                "counterforce" -> R.drawable.iconperks_counterforce
                "dance with me" -> R.drawable.iconperks_dancewithme
                "dark sense" -> R.drawable.iconperks_darksense
                "dark theory" -> R.drawable.iconperks_darktheory
                "dead hard" -> R.drawable.iconperks_deadhard
                "deception" -> R.drawable.iconperks_deception
                "decisive strike" -> R.drawable.iconperks_decisivestrike
                "deja vu" -> R.drawable.iconperks_dejavu
                "deliverance" -> R.drawable.iconperks_deliverance
                "desperate measures" -> R.drawable.iconperks_desperatemeasures
                "detectives hunch" -> R.drawable.iconperks_detectiveshunch
                "distortion" -> R.drawable.iconperks_distortion
                "diversion" -> R.drawable.iconperks_diversion
                "empathic connection" -> R.drawable.iconperks_empathicconnection
                "empathy" -> R.drawable.iconperks_empathy
                "fast track" -> R.drawable.iconperks_fasttrack
                "flash bang" -> R.drawable.iconperks_flashbang
                "flip flop" -> R.drawable.iconperks_flipflop
                "for the people" -> R.drawable.iconperks_forthepeople
                "guardian" -> R.drawable.iconperks_guardian
                "head on" -> R.drawable.iconperks_headon
                "hope" -> R.drawable.iconperks_hope
                "inner healing" -> R.drawable.iconperks_innerhealing
                "iron will" -> R.drawable.iconperks_ironwill
                "kindred" -> R.drawable.iconperks_kindred
                "leader" -> R.drawable.iconperks_leader
                "left behind" -> R.drawable.iconperks_leftbehind
                "lightweight" -> R.drawable.iconperks_lightweight
                "lithe" -> R.drawable.iconperks_lithe
                "lucky break" -> R.drawable.iconperks_luckybreak
                "mettle of man" -> R.drawable.iconperks_mettleofman
                "no mither" -> R.drawable.iconperks_nomither
                "no one left behind" -> R.drawable.iconperks_nooneleftbehind
                "object of obsession" -> R.drawable.iconperks_objectofobsession
                "off the record" -> R.drawable.iconperks_offtherecord
                "open handed" -> R.drawable.iconperks_openhanded
                "overcome" -> R.drawable.iconperks_overcome
                "over zealous" -> R.drawable.iconperks_overzealous
                "parental guidance" -> R.drawable.iconperks_parentalguidance
                "pharmacy" -> R.drawable.iconperks_pharmacy
                "plunderers instinct" -> R.drawable.iconperks_plunderersinstinct
                "poised" -> R.drawable.iconperks_poised
                "power struggle" -> R.drawable.iconperks_powerstruggle
                "premonition" -> R.drawable.iconperks_premonition
                "prove thyself" -> R.drawable.iconperks_provethyself
                "quick and quiet" -> R.drawable.iconperks_quickandquiet
                "red herring" -> R.drawable.iconperks_redherring
                "renewal" -> R.drawable.iconperks_renewal
                "repressed alliance" -> R.drawable.iconperks_repressedalliance
                "residual manifest" -> R.drawable.iconperks_residualmanifest
                "resilience" -> R.drawable.iconperks_resilience
                "rookie spirit" -> R.drawable.iconperks_rookiespirit
                "saboteur" -> R.drawable.iconperks_saboteur
                "self preservation" -> R.drawable.iconperks_self_preservation
                "self aware" -> R.drawable.iconperks_selfaware
                "self care" -> R.drawable.iconperks_selfcare
                "situational awareness" -> R.drawable.iconperks_situationalawareness
                "slippery meat" -> R.drawable.iconperks_slipperymeat
                "small game" -> R.drawable.iconperks_smallgame
                "smash hit" -> R.drawable.iconperks_smashhit
                "sole survivor" -> R.drawable.iconperks_solesurvivor
                "solidarity" -> R.drawable.iconperks_solidarity
                "soul guard" -> R.drawable.iconperks_soulguard
                "spine chill" -> R.drawable.iconperks_spinechill
                "sprint burst" -> R.drawable.iconperks_sprintburst
                "stakeout" -> R.drawable.iconperks_stakeout
                "streetwise" -> R.drawable.iconperks_streetwise
                "technician" -> R.drawable.iconperks_technician
                "tenacity" -> R.drawable.iconperks_tenacity
                "this is not happening" -> R.drawable.iconperks_thisisnothappening
                "trail of torment" -> R.drawable.iconperks_trailoftorment
                "unbreakabl" -> R.drawable.iconperks_unbreakable
                "up the ante" -> R.drawable.iconperks_uptheante
                "urban evasion" -> R.drawable.iconperks_urbanevasion
                "vigil" -> R.drawable.iconperks_vigil
                "viosionary" -> R.drawable.iconperks_visionary
                "wake up" -> R.drawable.iconperks_wakeup
                "well make it" -> R.drawable.iconperks_wellmakeit
                "were gonna live forever" -> R.drawable.iconperks_weregonnaliveforever
                else -> R.drawable.iconperks_windowsofopportunity
            }
            when(i){
                1-> {perkSlot1.setImageResource(drawableResource)
                    perk1Text.setText(perk)
                }
                2-> {perkSlot2.setImageResource(drawableResource)
                    perk2Text.setText(perk)
                }
                3-> {perkSlot3.setImageResource(drawableResource)
                    perk3Text.setText(perk)
                }
                else ->{perkSlot4.setImageResource(drawableResource)
                    perk4Text.setText(perk)
                }
            }
            list.remove(perk)

        }
    }
}
/* killer with perk slots */

class SurvivorPerkList(private var perks: MutableList<String>){
    fun resetList(){
        perks = mutableListOf("Ace in the hole","Adrenaline","Aftercare","Alert","Any Means Necessary","Appraisal","Autodidact","Balanced Landing","Better Together","Bit the bullet","blast mine","blood pact","boil over","bond","boon circle of healing","boon exponetial","boon shadowstep","borrowed time","botany knowledge","breakdown","breakout","buckleup","built to last","calm spirit","camaraderie","clairvoyance","corrective action","counterforce","dance with me","dark sense","dark theory","dead hard","deception","decisive strike","deja vu","deliverance","desperate measures","detectives hunch","distortion","diversion","empathic connection","empathy","fast track","flash bang","flip flop","for the people","guardian","head on","hope","inner healing","iron will","kindred","leader","left behind","lightweight","lithe","lucky break","mettle of man","no mither","no one left behind","object of obsession","off the record","open handed","overcome","over zealous","parental guidance","pharmacy","plunderers instinct","poised","power struggle","premonition","prove thyself","quick and quiet","red herring","renewal","repressed alliance","residual manifest","resilience","rookie spirit","saboteur","self preservation","self aware","self care","situational awareness","slippery meat","small game","smash hit","sole survivor","solidarity","soul guard","spine chill","sprint burst","stakeout","streetwise","technician","tenacity","this is not happening","trail of torment","unbreakabl","up the ante","urban evasion","vigil","viosionary","wake up","well make it","were gonna live forever","windows of opportunity")

    }

    fun removePerk(perk: String){
        perks.remove(perk)
    }

    fun addPerk(perk: String){
        perks.add(perk)
    }

    fun getList(): MutableList<String>{
        return perks
    }

}


class Survivor(private val name: String, private val perk1: String, private val perk2: String, private val perk3: String, private val perk4: String) {
    fun getName(): String {
        return name
    }

    fun getPerk1(): String {
        return perk1
    }

    fun getPerk2(): String {
        return perk2
    }

    fun getPerk3(): String {
        return perk3
    }

    fun getPerk4(): String {
        return perk4
    }
}




