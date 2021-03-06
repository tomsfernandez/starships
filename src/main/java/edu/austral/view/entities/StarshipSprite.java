package edu.austral.view.entities;

import edu.austral.GameFramework;
import edu.austral.model.entities.Starship;
import processing.core.PApplet;
import processing.core.PImage;

public class StarshipSprite extends EntitySprite {


    public StarshipSprite(Starship entity) {
        super(entity);
    }

    @Override
    public void render(PApplet sketch) {

        float entityWidth = entity.getShape().getBounds().width;
        float entityHeight = entity.getShape().getBounds().height;
        float positionX = entity.getPosition().x();
        float positionY = entity.getPosition().y();
        PImage image = getImage();
        sketch.pushMatrix();
        sketch.translate(positionX, positionY);
        sketch.rotate(PApplet.radians(entity.getDirectionAngle()));
        sketch.image(image, -entityHeight/2,-entityWidth/2, entityHeight, entityWidth);
        sketch.popMatrix();
    }

    @Override
    public PImage getImage() {
        return GameFramework.shipImage;
    }
}
