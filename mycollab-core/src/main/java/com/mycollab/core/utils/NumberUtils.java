/**
 * This file is part of mycollab-core.
 *
 * mycollab-core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-core.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.core.utils;

import java.math.BigDecimal;

/**
 * @author MyCollab Ltd
 * @since 5.1.4
 */
public class NumberUtils {
    public static double roundDouble(int scale, Double value) {
        if (value == null) {
            return 0d;
        }
        return new BigDecimal(String.valueOf(value)).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static Number zeroIfNull(Number value) {
        return (value != null) ? value : 0;
    }
}
