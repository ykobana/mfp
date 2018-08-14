echo "copy all files from dropbox..,"
nodes="./*"
for node in $nodes; do
  if [ -d $node ] ; then
    directories+=("$node")
    sh "$node/cp_from_dropbox.sh"
  fi
done
echo "copying all files has been done."
