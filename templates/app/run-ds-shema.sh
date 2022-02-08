#!/bin/bash

echo ""
echo "Running Design System Schema..."
echo ""

(
echo "Step 1 - Fetching json schemas from repository"
mkdir temp && cd temp || exit
git clone --depth 1 "{{inputs.url}}"
echo ""
)

echo "Step 2 - Executing ds-schema"
npx -q -p @zup-it/ds-schema-cli -p @zup-it/ds-schema-plugins -c ds-schema
rm -rf temp
echo ""

echo "Finished Design System Schema"
echo ""