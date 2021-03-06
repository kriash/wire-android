/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.core.controllers.tracking.events;

import android.support.annotation.NonNull;
import com.waz.zclient.core.controllers.tracking.attributes.Attribute;
import com.waz.zclient.core.controllers.tracking.attributes.RangedAttribute;

import java.util.HashMap;
import java.util.Map;

public abstract class Event {

    protected Map<RangedAttribute, Integer> rangedAttributes = new HashMap<>();
    protected Map<Attribute, String> attributes = new HashMap<>();

    @NonNull public abstract String getName();

    @NonNull
    public Map<RangedAttribute, Integer> getRangedAttributes() {
        return rangedAttributes;
    }

    @NonNull
    public Map<Attribute, String> getAttributes() {
        return attributes;
    }

    public boolean mustWaitForTrackingData() {
        return true;
    }

    public boolean onlySendOnce() {
        return false;
    }
}
