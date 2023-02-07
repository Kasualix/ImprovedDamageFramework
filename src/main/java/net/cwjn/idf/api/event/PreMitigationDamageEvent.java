package net.cwjn.idf.api.event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.eventbus.api.Event;

public class PreMitigationDamageEvent extends Event {

    private float fireDmg, waterDmg, lightningDmg, magicDmg, darkDmg, holyDmg, physicalDmg, pen, lifesteal;
    private float fireRes, waterRes, lightningRes, magicRes, darkRes, holyRes, physicalRes;
    private final LivingEntity target;

    public PreMitigationDamageEvent(LivingEntity target,
                                    float fireDmg, float waterDmg, float lightningDmg, float magicDmg, float darkDmg, float holyDmg, float physicalDmg,
                                    float pen, float lifesteal,
                                    float fireRes, float waterRes, float lightningRes, float magicRes, float darkRes, float holyRes, float physicalRes) {
        this.fireDmg = fireDmg;
        this.waterDmg = waterDmg;
        this.lightningDmg = lightningDmg;
        this.magicDmg = magicDmg;
        this.darkDmg = darkDmg;
        this.physicalDmg = physicalDmg;
        this.holyDmg = holyDmg;
        this.pen = pen;
        this.lifesteal = lifesteal;
        this.fireRes = fireRes;
        this.waterRes = waterRes;
        this.lightningRes = lightningRes;
        this.magicRes = magicRes;
        this.darkRes = darkRes;
        this.holyRes = holyRes;
        this.physicalRes = physicalRes;
        this.target = target;
    }

    public float getFireDmg() {
        return fireDmg;
    }

    public void setFireDmg(float fireDmg) {
        this.fireDmg = fireDmg;
    }

    public float getWaterDmg() {
        return waterDmg;
    }

    public void setWaterDmg(float waterDmg) {
        this.waterDmg = waterDmg;
    }

    public float getLightningDmg() {
        return lightningDmg;
    }

    public void setLightningDmg(float lightningDmg) {
        this.lightningDmg = lightningDmg;
    }

    public float getMagicDmg() {
        return magicDmg;
    }

    public void setMagicDmg(float magicDmg) {
        this.magicDmg = magicDmg;
    }

    public float getDarkDmg() {
        return darkDmg;
    }

    public void setDarkDmg(float darkDmg) {
        this.darkDmg = darkDmg;
    }

    public float getPhysicalDmg() {
        return physicalDmg;
    }

    public void setPhysicalDmg(float physicalDmg) {
        this.physicalDmg = physicalDmg;
    }

    public float getPen() {
        return pen;
    }

    public void setPen(float pen) {
        this.pen = pen;
    }

    public float getLifesteal() {
        return lifesteal;
    }

    public void setLifesteal(float lifesteal) {
        this.lifesteal = lifesteal;
    }

    public LivingEntity getTarget() {
        return target;
    }

    public float getFireRes() {
        return fireRes;
    }

    public void setFireRes(float fireRes) {
        this.fireRes = fireRes;
    }

    public float getWaterRes() {
        return waterRes;
    }

    public void setWaterRes(float waterRes) {
        this.waterRes = waterRes;
    }

    public float getLightningRes() {
        return lightningRes;
    }

    public void setLightningRes(float lightningRes) {
        this.lightningRes = lightningRes;
    }

    public float getMagicRes() {
        return magicRes;
    }

    public void setMagicRes(float magicRes) {
        this.magicRes = magicRes;
    }

    public float getDarkRes() {
        return darkRes;
    }

    public void setDarkRes(float darkRes) {
        this.darkRes = darkRes;
    }

    public float getPhysicalRes() {
        return physicalRes;
    }

    public void setPhysicalRes(float physicalRes) {
        this.physicalRes = physicalRes;
    }

    public float getHolyDmg() {
        return holyDmg;
    }

    public void setHolyDmg(float holyDmg) {
        this.holyDmg = holyDmg;
    }

    public float getHolyRes() {
        return holyRes;
    }

    public void setHolyRes(float holyRes) {
        this.holyRes = holyRes;
    }

    @Override
    public boolean isCancelable() {
        return false;
    }

}
