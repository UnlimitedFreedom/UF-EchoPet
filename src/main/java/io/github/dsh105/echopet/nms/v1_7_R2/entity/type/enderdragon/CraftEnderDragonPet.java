/*
 * This file is part of EchoPet.
 *
 * EchoPet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EchoPet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EchoPet.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.dsh105.echopet.nms.v1_7_R2.entity.type.enderdragon;

import io.github.dsh105.echopet.nms.v1_7_R2.entity.CraftPet;
import io.github.dsh105.echopet.nms.v1_7_R2.entity.EntityPet;
import io.github.dsh105.echopet.nms.v1_7_R2.entity.EntityPetType;
import io.github.dsh105.echopet.nms.v1_7_R2.entity.PetType;
import org.bukkit.craftbukkit.v1_7_R2.CraftServer;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.EnderDragon;

import java.util.Set;

@EntityPetType(petType = PetType.ENDERDRAGON)
public class CraftEnderDragonPet extends CraftPet implements EnderDragon {

    public CraftEnderDragonPet(CraftServer server, EntityPet entity) {
        super(server, entity);
    }

    @Override
    public Set<ComplexEntityPart> getParts() {
        return null;
    }
}