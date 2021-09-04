#!/bin/bash

#///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#
#  © 2011-2021 Telenav, Inc.
#  Licensed under Apache License, Version 2.0
#
#///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#
# Environment
#

ROOT="$(pwd)"
BRANCH="${GITHUB_REF//refs\/heads\//}"
SUPERPOM_BUILD="mvn --batch-mode --no-transfer-progress clean install"
BUILD="mvn -Dmaven.javadoc.skip=true -DKIVAKIT_DEBUG="!Debug" -P shade -P tools --no-transfer-progress --batch-mode clean install"
CLONE="git clone --branch "$BRANCH" --quiet"

#
# Install superpom
#

echo "Cloning kivakit"
cd "$ROOT"
$CLONE https://github.com/Telenav/kivakit.git

echo "Installing kivakit super POM"
cd "$ROOT"/kivakit/superpom
$SUPERPOM_BUILD

#
# Build lexakai-annotations
#

echo "Cloning lexakai-annotations"
cd "$ROOT"
$CLONE https://github.com/Telenav/lexakai-annotations.git

echo "Building lexakai-annotations"
cd "$ROOT"/lexakai-annotations
$BUILD
