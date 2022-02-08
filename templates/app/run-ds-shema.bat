@echo off
echo.
echo "Running Design System Schema..."

echo.
echo "Step 1 - Fetching json schemas from repository"

mkdir temp
cd temp
git clone --depth 1 {{inputs.url}}
cd ..

echo.
echo "Step 2 - Executing ds-schema"

call npx -q -p @zup-it/ds-schema-cli -p @zup-it/ds-schema-plugins -c ds-schema
rmdir temp /s /q

echo.
echo "Finished Design System Schema"
echo.