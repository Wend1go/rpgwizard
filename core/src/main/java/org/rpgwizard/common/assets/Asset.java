/**
 * Copyright (c) 2015, rpgwizard.org, some files forked from rpgtoolkit.net <info@rpgwizard.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.rpgwizard.common.assets;

import java.io.File;

/**
 *
 * @author Chris Hutchinson
 */
public interface Asset {

    File getFile();

    AssetDescriptor getDescriptor();

    void setDescriptor(AssetDescriptor assetDescriptor);

    void reset();

}
