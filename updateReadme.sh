lastLine=$(tail -n 1 README.md)
echo $lastLine
serialNumber=$(echo "$lastLine" | cut -d "|" -f1)
#echo $((serialNumber+1))
newSerialNumber=$((serialNumber+1))
newlyAddedFileNames=$(git diff --diff-filter=A --name-only HEAD )

fileArray=(${newlyAddedFileNames//" "/ })

for i in "${fileArray[@]}";
do
  if [[ $i =~ "test.java" ]]; then
    continue
  fi
  echo Do you want to continue\ file: $i?\(y\/n\)
  read ans
  echo $i
  if [[ "$ans" == "Y" || "$ans" == "y" ]]; then
      echo Enter the code link for file $i
    read codeLink
    echo codeLink you have entered is $codeLink
    echo Enter problem name
    read problemName
    echo "Line added in README.md"
    echo $newSerialNumber \| $problemName \|[Explanation]\($codeLink\)\| [Code]\($i\)\|
    echo $newSerialNumber \| $problemName \|[Explanation]\($codeLink\)\| [Code]\($i\)\| >> README.md
    git add README.md
    newSerialNumber=$((newSerialNumber+1))
  fi
done
