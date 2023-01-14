package dev.asyncbanana.divine_origins.actions;

import io.github.apace100.apoli.power.factory.action.ActionFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Entity_Actions {

    @SuppressWarnings("unchecked")
    public static void register() {
        register(new ActionFactory<>(new Identifier("divine_origins","freeze_entity"), new SerializableData()
                .add("amount", SerializableDataTypes.INT),
                (data, entity) -> {
                    entity.setFrozenTicks(entity.getFrozenTicks()+data.getInt("amount"));
                }));
    }

    private static void register(ActionFactory<Entity> actionFactory) {
        Registry.register(ApoliRegistries.ENTITY_ACTION, actionFactory.getSerializerId(), actionFactory);
    }
}