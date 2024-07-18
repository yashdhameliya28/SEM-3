let n = parseInt(prompt("Enter array size"));
        let a = new Array(n);
        for(i=0 ; i<a.length ; i++){
            a[i] = parseInt(prompt());
        }
        for(i=0 ; i<a.length ; i++){
            for(j=i+1 ; j<a.length ; j++){
                if(a[i] > a[j]){
                    let temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        document.write(a);