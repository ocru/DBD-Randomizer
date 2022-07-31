package com.example.dbdrandomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class killer_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_killer_main)

        val backButton: Button = findViewById(R.id.killer_back_button)

        val roll: Button = findViewById(R.id.rollButton)



        backButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }



        var killerPerks = KillerPerkList(mutableListOf(""))
        killerPerks.resetList()

        val killers: MutableList<String> = mutableListOf("Trapper","Wraith","Billy","Nurse","Michael","Hag","Doctor","Huntress","Bubba","Freddy","Pig","Clown","Spirit","Legion","Plague","Ghostface","Demo","Oni","DeathSlinger","Pyramid Head","Blight","Twins","Trickster","Nemesis","Pinhead","Artist","Sadako","Dredge")

        var perks = killerPerks.getList()

        roll.setOnClickListener(){
            selectKiller(killers)
            selectPerks(perks)
            killerPerks.resetList()
            perks = killerPerks.getList()


        }



    }
    fun selectKiller(list: MutableList<String>) {
        var killer = list.elementAt((0..list.size - 1).random())
        val killerImage: ImageView = findViewById(R.id.killer)
        val drawableResource = when (killer) {
            "Trapper" -> R.drawable.kill_trapper
            "Billy" -> R.drawable.kill_billy
            "Nurse" -> R.drawable.kill_nurse
            "Michael" -> R.drawable.kill_mikey
            "Hag" -> R.drawable.kill_hag
            "Doctor" -> R.drawable.kill_doctor
            "Huntress" -> R.drawable.kill_huntress
            "Bubba" -> R.drawable.kill_bubba
            "Freddy" -> R.drawable.kill_freddy
            "Pig" -> R.drawable.kill_pig
            "Clown" -> R.drawable.kill_clown
            "Spirit" -> R.drawable.kill_spirit
            "Legion" -> R.drawable.kill_legion
            "Plague" -> R.drawable.kill_plague
            "Ghostface" -> R.drawable.kill_ghostface
            "Demo" -> R.drawable.kill_demo
            "Oni" -> R.drawable.kill_oni
            "DeathSlinger" -> R.drawable.kill_deathslinger
            "Pyramid Head" -> R.drawable.kill_pphead
            "Blight" -> R.drawable.kill_blight
            "Twins" -> R.drawable.kill_twins
            "Trickster" -> R.drawable.kill_trickster
            "Nemesis" -> R.drawable.kill_nemesis
            "Pinhead" -> R.drawable.kill_pinhead
            "Artist" -> R.drawable.kill_artist
            "Sadako" -> R.drawable.kill_sadako
            else -> R.drawable.kill_dredge
        }
        killerImage.setImageResource(drawableResource)
    }

    fun selectPerks(list: MutableList<String>){
        var perk = ""
        val perkSlot1: ImageView = findViewById(R.id.perkSlot1)
        val perkSlot2: ImageView = findViewById(R.id.perkSlot2)
        val perkSlot3: ImageView = findViewById(R.id.perkSlot3)
        val perkSlot4: ImageView = findViewById(R.id.perkSlot4)
        val perk1Text: TextView = findViewById(R.id.textView)
        val perk2Text: TextView = findViewById(R.id.textView5)
        val perk3Text: TextView = findViewById(R.id.textView3)
        val perk4Text: TextView = findViewById(R.id.textView4)

        for (i in 1..4){
            perk = list.elementAt((0..list.size-1).random())
            var drawableResource = when (perk){
                "BBQ and chili" -> R.drawable.kiconperks_bbqandchili
                "Beast of Prey" -> R.drawable.kiconperks_beastofprey
                "Bitter Murmur" -> R.drawable.kiconperks_bittermurmur
                "Blood Echo" -> R.drawable.kiconperks_bloodecho
                "BloodHound" -> R.drawable.kiconperks_bloodhound
                "Bloodwarden" -> R.drawable.kiconperks_bloodwarden
                "Brutal Strength" -> R.drawable.kiconperks_brutalstrength

                "Call Of Brine" -> R.drawable.kiconperks_callofbrine
                "Corrupt Intervention" -> R.drawable.kiconperks_corruptintervention
                "Coulrophobia" -> R.drawable.kiconperks_coulrophobia
                "Coup de Grace" -> R.drawable.kiconperks_coupdegrace

                "Dark Devotion" -> R.drawable.kiconperks_darkdevotion
                "Darkness Revealed" -> R.drawable.kiconperks_darknessrevealed
                "Deadlock" -> R.drawable.kiconperks_deadlock
                "Deadmans Switch" -> R.drawable.kiconperks_deadmanswitch
                "Deathbound" -> R.drawable.kiconperks_deathbound
                "Deerstalker" -> R.drawable.kiconperks_deerstalker
                "Devour Hope" -> R.drawable.kiconperks_devourhope
                "Discordance" -> R.drawable.kiconperks_discordance
                "Dissolution" -> R.drawable.kiconperks_dissolution
                "Distressing" -> R.drawable.kiconperks_distressing
                "Dragons Grip" -> R.drawable.kiconperks_dragonsgrip
                "Dying Light" -> R.drawable.kiconperks_dyinglight
                "Enduring" -> R.drawable.kiconperks_enduring
                "Eruption" -> R.drawable.kiconperks_eruption
                "Fearmonger" -> R.drawable.kiconperks_fearmonger
                "Fire Up" -> R.drawable.kiconperks_fireup
                "Floods of Rage" -> R.drawable.kiconperks_floodofrage
                "Forced Penance" -> R.drawable.kiconperks_forcedpenance
                "Franklins Demise" -> R.drawable.kiconperks_franklinsdemise
                "Fugitive Chase" -> R.drawable.kiconperks_furtivechase
                "Gearhead" -> R.drawable.kiconperks_gearhead
                "Grim Embrace" -> R.drawable.kiconperks_grimembrace
                "Hangmans Trick" -> R.drawable.kiconperks_hangmanstrick
                "Haunted Grounds" -> R.drawable.kiconperks_hauntedground
                "Hex Blood Favor" -> R.drawable.kiconperks_hexbloodfavor
                "Hex Crowd Control" -> R.drawable.kiconperks_hexcrowdcontrol
                "Hex Plaything" -> R.drawable.kiconperks_hexplaything
                "Hex Retribution" -> R.drawable.kiconperks_hexretribution
                "Hex Undying" -> R.drawable.kiconperks_hexundying
                "Hoarder" -> R.drawable.kiconperks_hoarder
                "Huntress Lullaby" -> R.drawable.kiconperks_huntresslullaby
                "Hysteria" -> R.drawable.kiconperks_hysteria
                "Im all ears" -> R.drawable.kiconperks_imallears
                "Infectious Fright" -> R.drawable.kiconperks_infectiousfright
                "Insidious" -> R.drawable.kiconperks_insidious
                "Iron Grasp" -> R.drawable.kiconperks_irongrasp
                "Iron Maideen" -> R.drawable.kiconperks_ironmaiden
                "Knockout" -> R.drawable.kiconperks_knockout
                "Lethal Pursuer" -> R.drawable.kiconperks_lethalpursuer
                "Lightborn" -> R.drawable.kiconperks_lightborn
                "Mad Grit" -> R.drawable.kiconperks_madgrit
                "Make Your Choice" -> R.drawable.kiconperks_makeyourchoice
                "Merciless Storm" -> R.drawable.kiconperks_mercilessstorm
                "Monitor and Abuse" -> R.drawable.kiconperks_monitorandabuse
                "Monstrous Shrine" -> R.drawable.kiconperks_monstrousshrine
                "Nemesis" -> R.drawable.kiconperks_nemesis
                "NOED" -> R.drawable.kiconperks_nooneescapesdeath
                "No Way Out" -> R.drawable.kiconperks_nowayout
                "Opression" -> R.drawable.kiconperks_oppression
                "Overcharge" -> R.drawable.kiconperks_overcharge
                "Overwhelming Presence" -> R.drawable.kiconperks_overwhelmingpresence
                "Play with Your Food" -> R.drawable.kiconperks_playwithyourfood
                "Pop Goes the Weasel" -> R.drawable.kiconperks_popgoestheweasel
                "Predator" -> R.drawable.kiconperks_predator
                "Rancor" -> R.drawable.kiconperks_rancor
                "Remember Me" -> R.drawable.kiconperks_rememberme
                "Ruin" -> R.drawable.kiconperks_ruin
                "Save the Best for Last" -> R.drawable.kiconperks_savethebestforlast
                "Scour Hook Gift of Pain" -> R.drawable.kiconperks_scourgehookgiftofpain
                "Septic Touch" -> R.drawable.kiconperks_septictouch
                "Shadowborn" -> R.drawable.kiconperks_shadowborn
                "Sloppy Butcher" -> R.drawable.kiconperks_sloppybutcher
                "Spies from the Shadows" -> R.drawable.kiconperks_spiesfromtheshadows
                "Spirit Fury" -> R.drawable.kiconperks_spiritfury
                "Starstruck" -> R.drawable.kiconperks_starstruck
                "Stridor" -> R.drawable.kiconperks_stridor
                "Surge" -> R.drawable.kiconperks_surge
                "Surveillance" -> R.drawable.kiconperks_surveillance
                "Territorial Imperative"-> R.drawable.kiconperks_territorialimperative
                "Thanatophobia" -> R.drawable.kiconperks_thatanophobia
                "Third Seal" -> R.drawable.kiconperks_thethirdseal
                "Thrilling Tremors" -> R.drawable.kiconperks_thrillingtremors
                "Agitation" -> R.drawable.kperks_agitation
                "Nurses Calling" -> R.drawable.kperks_anursescalling
                "Bamboozle" -> R.drawable.kperks_bamboozle
                "Claustrophobia" -> R.drawable.kperks_claustrophobia
                "Hex Pentimento" -> R.drawable.kperks_hexpentimento
                "Pain Resonance" -> R.drawable.kperks_painresonance
                "Shatter Hope" -> R.drawable.kperks_shatteredhope
                "Thrill of the Hunt" -> R.drawable.kperks_thrillofthehunt
                "Tinkerer" -> R.drawable.kperks_tinkerer
                "Unnerving Presence" -> R.drawable.kperks_unnervingpresence
                "Unrelenting" -> R.drawable.kperks_unrelenting
                "Whispers" -> R.drawable.kperks_whispers
                else -> R.drawable.kperks_zanshintactics
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

class KillerPerkList(private var perks: MutableList<String>){
    fun resetList(){
        perks = mutableListOf("BBQ and chili","Beast of Prey","Bitter Murmur","Blood Echo","BloodHound","Bloodwarden","Brutal Strength","Call Of Brine","Corrupt Intervention", "Coulrophobia","Coup de Grace","Dark Devotion","Darkness Revealed","Deadlock","Deadmans Switch","Deathbound","Deerstalker","Devour Hope","Discordance","Dissolution","Distressing","Dragons Grip","Dying Light","Enduring","Eruption","Fearmonger","Fire Up","Floods of Rage","Forced Penance","Franklins Demise","Fugitive Chase","Gearhead","Grim Embrace","Hangmans Trick","Haunted Grounds","Hex Blood Favor","Hex Crowd Control","Hex Plaything","Hex Retribution","Hex Undying","Hoarder","Huntress Lullaby","Hysteria","Im all ears","Infectious Fright","Insidious","Iron Grasp","Iron Maideen","Knockout","Lethal Pursuer","Lightborn","Mad Grit","Make Your Choice","Merciless Storm","Monitor and Abuse","Monstrous Shrine","Nemesis","NOED","No Way Out","Opression","Overcharge","Overwhelming Presence","Play with Your Food","Pop Goes the Weasel","Predator","Rancor","Remember Me","Ruin","Save the Best for Last","Scour Hook Gift of Pain","Septic Touch","Shadowborn","Sloppy Butcher","Spies from the Shadows","Spirit Fury","Starstruck","Stridor","Surge","Surveillance","Territorial Imperative","Thanatophobia","Third Seal","Thrilling Tremors","Agitation","Nurses Calling","Bamboozle","Claustrophobia","Hex Pentimento","Pain Resonance","Shatter Hope","Thrill of the Hunt","Tinkerer","Unnerving Presence","Unrelenting","Whispers","Zanshin Tactics")
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


class Killer(private val name: String, private val perk1: String, private val perk2: String, private val perk3: String, private val perk4: String) {
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